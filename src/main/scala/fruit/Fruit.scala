package fruit
import fruit.Values

class Fruit extends Values {

  protected var name : String = ""
  protected var price : Double = 0.0
  protected var tax : Double = number

  def name_ (newValue: String) : Unit = {
    name = newValue
  }

  def price_ (newValue: Double) : Unit = {
    price = newValue
  }

  def tax_ (newValue: Double) : Unit = {
    tax = newValue
  }

  def get_name(): String ={
    return name
  }

  def get_price(): Double ={
    return price
  }

  def get_tax(): Double ={
    return tax
  }

  def returnTotalPrice() : Double = {
    return (price + tax)
  }

  override def toString: Whatever = {
    return  printFruit(this)
  }

}
