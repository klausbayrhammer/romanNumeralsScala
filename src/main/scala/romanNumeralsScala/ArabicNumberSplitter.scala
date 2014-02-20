package romanNumeralsScala

case class ArabicNumberSplitter(arabicNumber: Int) {
  def constituentParts: List[Int] = {
    recSplit(arabicNumber, 10).reverse
  }

  def recSplit(remainingArabicNumerals: Int, pow: Int): List[Int] =
    remainingArabicNumerals match {
      case 0 => List()
      case _ => {
        val numeral = remainingArabicNumerals % pow
        numeral :: recSplit(remainingArabicNumerals - numeral, pow * 10)
      }
    }
}
