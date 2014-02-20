package romanNumeralsScala

<<<<<<< HEAD
import org.scalatest.{Matchers, FunSuite}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.TableDrivenPropertyChecks

@RunWith(classOf[JUnitRunner])
class RomanNumeralsTest extends FunSuite with TableDrivenPropertyChecks with Matchers {

  val examples = Table(
      ("arabic", "roman"),
      (1, "I"),
      (2, "II"),
      (3, "III"),
      (4, "IV"),
      (5, "V"),
      (6, "VI"),
      (7, "VII"),
      (8, "VIII"),
      (9, "IX"),
      (10, "X"),
      (40, "XL"),
      (1000, "M"),
      (1043, "MXLIII"),
      (1066, "MLXVI")
  )

  forAll(examples) {
    (arabic: Int, roman: String) =>
    RomanNumerals.toRomanNumber(arabic) should be(roman)
  }
=======
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

>>>>>>> origin/master
}
