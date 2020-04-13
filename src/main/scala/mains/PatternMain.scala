package mains
import forComprehension.ForComprehension
import cats.{Breed, Cat}
import patternMatching.PatternMatching


object PatternMain {

  def main(args: Array[String]) {
    val patternMatching = new PatternMatching
    val bengal = new Breed {}.Bengal("Zachary", "red")
    //Same type
    println("Same pattern matching type: " + patternMatching.matchColor("red"))
    //Mixed type
    println("Different pattern matching type: " + patternMatching.matchMixTypes(1))
    println(patternMatching.matchMixTypes(4))
    //Matching classes
  //  println("Matching classes: " + patternMatching.matchBreed(bengal))
  }
}
