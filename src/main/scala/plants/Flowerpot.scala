package plants

class Flowerpot[A] (planted : A) { // >: Carrot <: Vegetable

  override def toString: String = {
    return(planted.toString)
  }

}