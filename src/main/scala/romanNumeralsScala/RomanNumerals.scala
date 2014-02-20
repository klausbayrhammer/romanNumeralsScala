package romanNumeralsScala

/**
 * @author Klaus Bayrhammer
 */
object RomanNumerals {
  def ARABIC_TO_ROMAN_NUMERALS = Map(
          1 -> "I",
          5 -> "V",
          10->"X").withDefaultValue("")

  def toRomanNumber(arabicNumber: Int) = {
    ARABIC_TO_ROMAN_NUMERALS(arabicNumber)
  }
}
