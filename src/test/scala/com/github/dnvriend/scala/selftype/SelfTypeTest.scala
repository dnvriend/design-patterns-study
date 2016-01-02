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

package com.github.dnvriend.scala.selftype

import java.io.PrintStream

import com.github.dnvriend.TestSpec

/**
 * see: http://stackoverflow.com/questions/4017357/difference-between-this-and-self-in-self-type-annotations/4018995#4018995
 * see: http://stackoverflow.com/questions/1990948/what-is-the-difference-between-self-types-and-trait-subclasses
 * see: http://marcus-christie.blogspot.nl/2014/03/scala-understanding-self-type.html
 * see: https://coderwall.com/p/t_rapw/cake-pattern-in-scala-self-type-annotations-explicitly-typed-self-references-explained
 */
class SelfTypeTest extends TestSpec {

  /**
   * ==Overview==
   * The self type annotation allows you to split a trait in two but still refer to things on the second trait as
   * though they are defined in the first trait, requiring they are mixed in together.
   *
   * The self type annotation allows you to express a dependency within a trait, a dependency that when satisfied
   * allows one trait to make use of code defined in a separate trait.
   *
   * What's the difference from extending a class? Extends is actually extending it and is very type specific.
   * The self type annotation is just declaring that this type needs to extend / implement the annotated type,
   * but it doesn't extend it yet. It lets you ''inject'' the extension, thus supports dependency injection.
   *
   * You can use any identifier for the self type annotation, eg. ''self'' or ''this'' or ''scalaIsGreat'', which
   * according to Martin Odersky on the question ''Is there any real difference between using this or self or foo as the
   * name for the identifier of the self type annotation?''
   *
   * All three forms are valid, and have the effect that B is assumed as the type of this in class A. The variants
   *
   * {{{
   *  trait A { self: B => ... }
   *  trait A { foo: B => ... }
   * }}}
   *
   * introduce self (respectively, foo) as an alias for this in trait A. This is useful for accessing the this reference
   * from an inner class. I.e. you could then use self instead of A.this when accessing the this reference of the trait A
   * from a class nested within it. The third variant,
   *
   * {{{
   * trait A { this: B => ... }
   * }}}
   *
   * does not introduce an alias for this; it just sets the self type.
   *
   */
  trait User { def name: String }

  /**
   * Tweeter, ''requires'' a User
   */
  trait Tweeter { user: User ⇒
    def tweet(msg: String, out: PrintStream): Unit = out.println(s"$name: $msg")
  }

  "Correct inheritance" should "compile" in {
    """trait TweetUser extends User with Tweeter""" should compile
  }

  "Incorrect inheritance" should "not compile" in {
    """class NoUserTweeter extends Tweeter""" shouldNot compile
  }
}
