package romanNumeralsScala

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
}
