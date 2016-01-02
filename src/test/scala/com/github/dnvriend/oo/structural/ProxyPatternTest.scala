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

class ProxyPatternTest extends TestSpec {

  /**
   * ==TL;DR==
   * ''It provides a surrogate or placeholder for another object to control access to it''
   *
   * ==Overview==
   * A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could
   * interface to anything: a network connection, a large object in memory, a file, or some other resource that is
   * ''expensive or impossible to duplicate''. In short, a proxy is a wrapper or agent object that is being called by
   * the client to access the real serving object behind the scenes.
   *
   * GOF defines several types of proxies:
   *
   * <ul>
   *   <li>'''A virtual proxy''': Creates expensive objects on demand. The rationale is ''to defer the full cost of its creation
   *  and initialization until we actually need to use it''</li>
   *  <li>'''A remote proxy''': Provides a local representative for an object in a different address space.</li>
   *  <li>'''A protection proxy''': Controls access to an object, thereby enforcing some security policy.</li>
   *  </ul>
   * *
   * ==Intent==
   * Proxy contains a reference to the RealSubject and handles all incoming requests from clients, it is this level of
   * indirection that is the key to the pattern. They both share the same interface Subject, since clients should not
   * be able to distinguish them.
   *
   * ==Componentization==
   * What differs from each instantiation are the types of Subject, RealSubject and Proxy. Only the fact that a Proxy
   * must contain a reference to a RealSubject stays the same, but this is hardly worth componentizing and would not
   * survive the less tokens expended rule.
   *
   * ==Scala==
   * One of Scalas features is lazy evaluation, this gives direct language support for some aspects of the Proxy pattern.
   * Very little boilerplate code exist in the pattern, making it a bad candidate for componentization.
   */
  trait Proxy

  object VirtualProxy extends Proxy {
    lazy val expensiveOperation = (1 to 100).toList
  }

  "VirtualProxy" should "create an expensive object (in this case a data structure) on demand" in {
    VirtualProxy.expensiveOperation.last shouldBe 100
  }
}
