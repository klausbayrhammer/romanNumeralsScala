package romanNumeralsScala

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import romanNumeralsScala.RomanNumerals

@RunWith(classOf[JUnitRunner])
class RomanNumeralsTest extends FunSuite with ShouldMatchers {

  test("An arabic 1 should be a roman I") {
    RomanNumerals.toRomanNumber(1) should be ("I")
  }

  test("An arabic 5 should be a roman V") {
    RomanNumerals.toRomanNumber(5) should be ("V")
  }

  test("An arabic 10 should be a roman X") {
    RomanNumerals.toRomanNumber(10) should be ("X")
  }

  test("An arabic 2 should be a roman II") {
    RomanNumerals.toRomanNumber(11) should be ("XI")
  }

}
