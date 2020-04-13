import org.scalatest.FunSuite
import enumerations.Day

class EnumerationTest extends FunSuite {
  test("Not weekend"){
  assertResult(false) {
    Day.isWeekend(Day.fourth)
  }
  }

  test("Weekend"){
    assert(Day.isWeekend(Day.sixth))
  }
}


