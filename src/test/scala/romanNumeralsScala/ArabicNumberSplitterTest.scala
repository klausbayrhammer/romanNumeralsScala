package romanNumeralsScala

import org.scalatest.{Matchers, FunSuite}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ArabicNumberSplitterTest extends FunSuite with Matchers {

  test("An arabic 1 should be a List(1)") {
    ArabicNumberSplitter(1).constituentParts should be (List(1))
  }

  test("An arabic 2 should be a List(2)") {
    ArabicNumberSplitter(2).constituentParts should be (List(2))
  }

  test("An arabic 11 should be a List(10, 1)") {
    ArabicNumberSplitter(11).constituentParts should be (List(10, 1))
  }

  test("An arabic 123 should be a List(3, 20, 100)") {
    ArabicNumberSplitter(123).constituentParts should be (List(100, 20, 3))
  }

}
