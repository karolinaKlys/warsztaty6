package patternMatching
import cats.Breed

class PatternMatching extends App {
  def matchColor(x: String): Int = x match {
    case "red" => 1
    case "grey" => 2
    case "black" => 3
    case _ => 4
  }

  def matchMixTypes (x: Any): Any = x match{
    case 1 => "red"
    case "grey" => 2
    case z: Int => "Dowolna całkowita"
  }

  def matchBreed(breed: Breed): String = {
    breed match {
      case breed.RussianBlue(name, owner) => s"Cat's name: $name. Owner's name: $owner"
      case breed.Bengal(name, color) if(color == "red" || color == "black") => s"Cat's name: $name Cat's color: $color"
      case breed.Siamese(name, age) => s"Cat's name: $name Cat's age: $age"
    }
  }
}
