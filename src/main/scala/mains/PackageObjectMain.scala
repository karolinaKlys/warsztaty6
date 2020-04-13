package mains

import fruit.{Fruit, Pig, Plum, Values}

object PackageObjectMain extends Values {

  def main(args: Array[String]): Unit = {

    printA()

    val fruit = new Fruit()
    fruit.name_("Apple")
    fruit.price_(1.98)
    println("Tax: " + fruit.get_tax())
    println(fruit.toString())
    println(fruit.toString().getClass())

    val pig = new Pig("Agata", 123)
    pig.voice()

    createPig()

    val plum = new Plum()
    println("Plum name: " + plum.get_name())
    plum.voice()




  }

}
