package plants

trait Plant {

    val name : String
    val colour : String

  override def toString: String = {
    return("Hello, I'm " + name + " and I'm " + colour)
  }

}

