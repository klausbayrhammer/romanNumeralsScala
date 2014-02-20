package romanNumeralsScala

object RomanNumerals {
  def ARABIC_TO_ROMAN_NUMERALS = Map(
          1 -> "I",
          2 -> "II",
          3 -> "III",
          4 -> "IV",
          5 -> "V",
          6 -> "VI",
          7 -> "VII",
          8 -> "VIII",
          9->"IX",
          10->"X",
          40->"XL",
          60->"LX",
          1000->"M"
  ).withDefaultValue("")

  def toRomanNumber(arabicNumber: Int) = {
    val listOfConstituentParts = ArabicNumberSplitter(arabicNumber).constituentParts

    listOfConstituentParts.flatMap(ARABIC_TO_ROMAN_NUMERALS(_)).mkString
  }
}
