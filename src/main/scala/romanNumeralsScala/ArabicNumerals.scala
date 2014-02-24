package romanNumeralsScala


object ArabicNumerals {

  val ROMAN_TO_ARABIC = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10)

  def addSignForSubtraction(seq: List[Int]): List[Int] = seq match {
    case tail :: Nil => List(tail)
    case head :: tail => {
      tail match {
        case firstHeadOfTail :: Nil => {
          val subtractNumber = head < firstHeadOfTail
          addNumberWithSign(head, tail, subtractNumber)
        }
        case firstHeadOfTail :: secondHeadOfTail :: _ => {
          val subtractNumber = head < firstHeadOfTail || head < secondHeadOfTail
          addNumberWithSign(head, tail, subtractNumber)
        }
      }
    }
  }

  def addNumberWithSign(head: Int, tail: List[Int], subtractNumber: Boolean): List[Int] = {
    if (subtractNumber)
      -head :: addSignForSubtraction(tail)
    else
      head :: addSignForSubtraction(tail)
  }

  def toArabicNumber(arabicNumber: String) = {
    val listOfArabicNumbers = arabicNumber.map(ROMAN_TO_ARABIC(_)).toList
    val listOfArabicNumbersWithSigns = addSignForSubtraction(listOfArabicNumbers)
    listOfArabicNumbersWithSigns.sum
  }
}
