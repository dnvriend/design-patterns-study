/*
 * Copyright 2015 Dennis Vriend
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dnvriend.oo.structural

import com.github.dnvriend.TestSpec

class FacadePatternTest extends TestSpec {

  /**
    * Intent:
    * Provide a unified interface to a set of interfaces in a `subsystem`.
    * Facade defines a higher-level interface that makes the subsystem easier to use.
    *
    * Description:
    * Facade provides a simple interface to a complex subsystem. This is done in order to shield clients,
    * that does not need the lower level functionality provided by subsystems, from the complexity.
    *
    * Clients communicate with the subsystem by sending requests to a facade, the facade translates and handles
    * intercommunication between the subsystems
    *
    * Facades can be used to layer a system by decoupling subsystems. A specific facade functions as an entry point
    * to the subsystems it encapsulates.
    *
    * The use of facades as entry points promotes weak coupling between subsystem components and lets you vary the
    * components without affecting the clients.
    *
    * Componentization:
    * The things that differ are the `subsystems`, their intercommunication, which we cannot abstract over, and the
    * interface of the facade itself. Nothing stays the same between different instantiations, which means there is
    * nothing to modularize and reuse.
    *
    * Scala:
    * The trait Facade is an abstract facade with nested subsystem classes that are only accessible by Facade and subclasses.
    * The method foo is part of the public interface of the facade accessible by clients, it calls one of the subsystems with
    * another subsystem as argument. The singleton object FacadeA is an example of a concrete facade
    */

  trait Facade {
    // contains refs to `subsystems`
    type A <: SubSystemA
    type B <: SubSystemB

    val subA: A
    val subB: B

    def foo(num: Int): Int = subB.foo(subA, num)
  }

  class SubSystemA {
    def add(num: Int) = num + 1
  }
  class SubSystemB {
    def foo(sub: SubSystemA, num: Int): Int = sub.add(num)
  }

  object FacadeA extends Facade {
    override type A = SubSystemA
    override type B = SubSystemB
    override val subA = new SubSystemA()
    override val subB = new SubSystemB()
  }

  "Facade" should "provide a unified interface to a set of subsystems, and hide implementation details" in {
    FacadeA.foo(5) shouldBe 6
  }
}
