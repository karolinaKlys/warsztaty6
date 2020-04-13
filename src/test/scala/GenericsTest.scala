import org.scalatest.FeatureSpec
import org.scalatest.FunSuite
import org.scalatest.exceptions.TestFailedException
import sun.applet.Main

class GenericsTest extends FunSuite {

  test("NumericValueTest1"){
    def multiply[T](x: T, y: T)(implicit num: Numeric[T]): T = {
      import num._
      return x * y
    }
    assert(multiply(1, 5) == 5)
  }

  test("NumericValueTest2"){
    def multiply[T](x: T, y: T)(implicit num: Numeric[T]): T = {
      import num._
      return x * y
    }
    assert(multiply(1.5, 2) == 3.0)
  }

}


