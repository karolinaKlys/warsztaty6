package cats

abstract class Breed {
  case class RussianBlue(name: String, owner: String) extends Breed
  case class Bengal(name: String, color: String) extends Breed
  case class Siamese(name: String, age: Int) extends Breed
}
