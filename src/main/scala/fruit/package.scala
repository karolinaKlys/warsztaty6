import fruit.Values

package object fruit extends Values {

  // zmienne
  val number : Double = 0.17

  // metoda z wykorzystaniem zmiennej z traita Values
  def returnA() : Int = {
    return a
  }

  // metoda
  def printFruit (fruit : Fruit) : String = {
    return(fruit.get_name + " - " + fruit.returnTotalPrice())
  }

  // klasa
  class Pig(val name: String, val weight: Double) {
    def voice() : Unit = {
      println("Chrum chrum")
    }
  }

  // niejawna konwersja Pig -> Double
  implicit def pigToDouble(pig: Pig): Double = pig.weight

  // klasa dziedzicząca
  class Plum extends Fruit {
    name = "Plum"
    def voice() : Unit = {
      println("Plum plum")
    }
  }

  // alias
  type Whatever = String

}
