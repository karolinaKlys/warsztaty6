import fruit.Fruit
import org.scalatest.FeatureSpec
import org.scalatest.FunSuite
import org.scalatest.exceptions.TestFailedException
import sun.applet.Main

class PackageObjectsTest extends FunSuite {

  test("TaxValueTest"){
    val fruit = new Fruit()
    assert(fruit.get_tax() == 0.17)
  }
}


