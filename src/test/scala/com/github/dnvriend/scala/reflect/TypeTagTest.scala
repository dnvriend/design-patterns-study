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

package com.github.dnvriend.scala.reflect

import com.github.dnvriend.TestSpec

import scala.reflect.runtime.universe._
import scala.reflect.{ClassTag, classTag}

/**
  * Should be included in Scala 2.12M6
  * see: SI-6517
  */
class TypeTagTest extends TestSpec {

  class Foo
  class Bar extends Foo

  def determineTypeImplicitClassTag[A : ClassTag](xs: List[A]) = classTag[A] match {
    case ct if ct == classTag[String] => "strings"
    case ct if ct == classTag[Int] => "ints"
    case ct if ct == classTag[Bar] => "bars"
    case ct if ct == classTag[Foo] => "foos"
  }
  
  def determineTypeImplicitTypeTag[A](xs: List[A])(implicit ev: TypeTag[A]) = typeOf[A] match {
    case t if t =:= typeOf[String] ⇒ "strings" //  =:= (type equality)
    case t if t =:= typeOf[Int]    ⇒ "ints"
    case t if t <:< typeOf[Bar] => "bars" //  <:< (subtype relation)
    case t if t <:< typeOf[Foo] => "foos"
  }

  def determineType[A: TypeTag](xs: List[A]) = typeOf[A] match {
    case t if t =:= typeOf[String] ⇒ "strings" //  =:= (type equality)
    case t if t =:= typeOf[Int]    ⇒ "ints"
    case t if t <:< typeOf[Bar] => "bars" //  <:< (subtype relation)
    case t if t <:< typeOf[Foo] => "foos"
  }

  // non-variable type argument String in type pattern List[String] (the underlying of List[String]) is unchecked
  // since it is eliminated by erasure
  def determineTypeNaive[A](xs: List[A]) = xs match {
    case _: List[String @unchecked] ⇒ "strings"
    case _: List[Int @unchecked]    ⇒ "ints"
  }

  "determineTypeNaive" should "match ints" in {
    determineTypeNaive(List(1, 2)) shouldBe "strings"
  }

  it should "match strings" in {
    determineTypeNaive(List("a", "b")) shouldBe "strings"
  }

  "determineType" should "match ints" in {
    determineType(List(1, 2)) shouldBe "ints"
  }

  it should "match strings" in {
    determineType(List("a", "b")) shouldBe "strings"
  }

  it should "match bars" in {
    determineType(List(new Bar)) shouldBe "bars"
  }

  it should "match foo" in {
    determineType(List(new Foo)) shouldBe "foos"
  }

  "determineTypeImplicitTypeTag" should "match ints" in {
    determineTypeImplicitTypeTag(List(1, 2)) shouldBe "ints"
  }

  it should "match strings" in {
    determineTypeImplicitTypeTag(List("a", "b")) shouldBe "strings"
  }

  it should "match bars" in {
    determineTypeImplicitTypeTag(List(new Bar)) shouldBe "bars"
  }

  it should "match foo" in {
    determineTypeImplicitTypeTag(List(new Foo)) shouldBe "foos"
  }

  "determineTypeImplicitClassTag" should "match ints" in {
    determineTypeImplicitClassTag(List(1, 2)) shouldBe "ints"
  }

  it should "match strings" in {
    determineTypeImplicitClassTag(List("a", "b")) shouldBe "strings"
  }

  it should "match bars" in {
    determineTypeImplicitClassTag(List(new Bar)) shouldBe "bars"
  }

  it should "match foo" in {
    determineTypeImplicitClassTag(List(new Foo)) shouldBe "foos"
  }
}
