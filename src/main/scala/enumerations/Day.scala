package enumerations

object Day extends Enumeration {
  type Day = Value

  val first = Value("Monday")
  val second = Value("Tuesday")
  val third = Value("Wednesday")
  val fourth = Value("Thursday")
  val fifth = Value("Friday")
  val sixth = Value("Saturday")
  val seventh = Value("Sunday")

  def isWeekend(day: Day): Boolean = {
    if (day == Day.sixth || day == Day.seventh) {
      true
    } else false
  }
}
