package patternMatching

import cats.{Bengal, Breed, RussianBlue, Siamese}

class PatternMatching extends App {
  def matchColor(x: String): Int = x match {
    case "red" => 1
    case "grey" => 2
    case "black" => 3
    case _ => 4
  }

  def matchMixTypes(x: Any): Any = x match {
    case 1 => "red"
    case "grey" => 2
    case z: Int => "Dowolna całkowita"
  }

  def matchBreed(breed: Breed): String = {
    breed match {
      case RussianBlue(name, owner) => s"Cat's name: $name. Owner's name: $owner"
      case Bengal(name, color) if (color == "red" || color == "black") => s"Cat's name: $name Cat's color: $color"
      case Siamese(name, age) => s"Cat's name: $name Cat's age: $age"
      case _ => "None"
    }
  }

  object Extractor {
    def apply(x: Int): Int = x * 3
    def unapply(y: Int): Option[Int] =
      if (y%3 == 0) Some(y/3)
      else None
  }

  def extractorTest(z:Int): Int ={
    val x = Extractor(z)
    x match { case Extractor(n) => n }
  }
}
