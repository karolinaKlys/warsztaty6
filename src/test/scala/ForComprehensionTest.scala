import org.scalatest.FeatureSpec
import org.scalatest.FunSuite
import forComprehension.ForComprehension
import cats.Cat
import org.scalatest.exceptions.TestFailedException
import sun.applet.Main

class ForComprehensionTest extends FunSuite {
  test("For/foreach test"){
    val forComprehension = new ForComprehension
    val list = forComprehension.createList()
    val namesSugar = forComprehension.versionWithoutSugar( 3, 5, list)
    val namesNoSugar = forComprehension.versionWithSugar(3, 5, list)
    assert(namesSugar == namesNoSugar)
  }

  test("For comprehension test"){
    val forComprehension = new ForComprehension
    val list = forComprehension.createList()
    val namesSugar = forComprehension.versionWithoutSugar( 3, 5, list)
    val namesNoSugar: List[String] =  List("Paul", "Antoni", "Zachary", "Princess", "Gold", "Lion")
    assert(namesSugar == namesNoSugar)
  }

  test("Map test"){
    val forComprehension = new ForComprehension
    val list = forComprehension.createList()
    val weightSugar = forComprehension.mapWithSugar(list)
    val weightNoSugar = forComprehension.mapWithoutSugar(list)
    assert(weightSugar == weightNoSugar)
  }

  test("FlatMap test"){
    val forComprehension = new ForComprehension
    val list = forComprehension.createList()
    val namesNoSugar: List[String] = List("wanilia", "paul", "antoni", "coco", "zachary", "princess", "vera", "gold", "lion", "olaf")
    val namesSugar = forComprehension.flatMapWithSugar(list)
    assert(namesSugar == namesNoSugar)
    }

  test("Option test"){
    val forComprehension = new ForComprehension
    val list = forComprehension.createList()
    val option = forComprehension.optionSugar()
    assert(option.isEmpty)
  }
}


