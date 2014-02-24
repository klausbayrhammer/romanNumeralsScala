package romanNumeralsScala

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.prop.TableDrivenPropertyChecks

class ArabicNumeralsTest extends FunSuite with TableDrivenPropertyChecks with Matchers {

  val examples = Table(
    ("roman", "arabic"),
    ("I", 1),
    ("II", 2),
    ("V", 5),
    ("X", 10),
    ("IX", 9),
    ("IIX", 8),
    ("XIV", 14)
  )

  forAll(examples) {
    (roman: String, arabic: Int) =>
      ArabicNumerals.toArabicNumber(roman) should be(arabic)
  }
}
