package mains

import plants.{Banana, Carrot, Chair, Flowerpot, Fruit, Tulip, Vegetable}

object GenericsMain {

  def main(args: Array[String]): Unit = {

//      val flowerpot1 = new Flowerpot[Tulip](new Tulip())
//      println(flowerpot1.toString())
//
//      val flowerpot2 = new Flowerpot[Fruit](new Fruit())
//      println(flowerpot2.toString())
//
//      val flowerpot3 = new Flowerpot[Banana](new Banana())
//      println(flowerpot3.toString())
//
//      val flowerpot4 = new Flowerpot[Vegetable](new Vegetable())
//      println(flowerpot4.toString())
//
//      val flowerpot5 = new Flowerpot[Carrot](new Carrot())
//      println(flowerpot5.toString())
//
//      val flowerpot6 = new Flowerpot[Chair](new Chair())
//      println(flowerpot6.toString())
//
//      val flowerpotInvariance : Flowerpot[Fruit] = new Flowerpot[Fruit](new Fruit())
//      val flowerpotCovariance : Flowerpot[Fruit] = new Flowerpot[Banana](new Banana())
//      val flowerpotContravariance: Flowerpot[Banana] = new Flowerpot[Fruit](new Fruit())

      def multiply[T](x: T, y: T)(implicit num: Numeric[T]): T = {
          import num._
          return x * y
        }

       println(multiply(1, 5))
       println(multiply(1.5, 2))
  }

}
