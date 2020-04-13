package mains
import forComprehension.ForComprehension
import cats.Cat


object ComprehensionMain {

  def main(args: Array[String]) {
    val forComprehension = new ForComprehension()
    val catsList = forComprehension.createList()

    //Foreach
    forComprehension.versionWithoutSugar(3, 5, catsList)
    forComprehension.versionWithSugar(3, 5, catsList)
    println("Without: " + forComprehension.versionWithoutSugar(3, 5, catsList))
    println("With: " + forComprehension.versionWithSugar(3, 5, catsList))

    //Multiple generators
    forComprehension.multipleGenerators(10).foreach {
      case (i, j) =>
        println(s"($i, $j) ")
    }
    //Option
    println(forComprehension.optionSugar())

    //Map
    println("Map: ")
    println(forComprehension.mapWithoutSugar(catsList))
    println(forComprehension.mapWithSugar(catsList))

    //FlatMap
    println("FlatMap: ")
    println(forComprehension.flatMapWithoutSugar(catsList))
    println(forComprehension.flatMapWithSugar(catsList))
  }
}
