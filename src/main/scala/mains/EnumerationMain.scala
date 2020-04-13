package mains
import enumerations.Day
import enumerations.Day.Day

object EnumerationMain {
  def main(args: Array[String]): Unit = {
    println("Today is weekend: " + Day.isWeekend(Day.seventh))
  }
}
