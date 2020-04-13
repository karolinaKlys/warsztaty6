package fruit

trait Values {

  val a : Int = 5
  val b : Double = 14.0
  val c : Whatever = "Ala ma kota"

  def printNumber() : Unit = {
    println(number)
  }

  def printA() : Unit = {
    returnA()
  }

  def createPig() : Unit = {
    val pig = new Pig("Krystyna", 103)
    pig.voice()
    val double : Double = pigToDouble(pig)
    println("Pig to double: " + double)
  }

  def createPlum() : Unit = {
    val plum = new Plum()
    plum.voice()
  }

}
