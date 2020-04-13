import patternMatching.PatternMatching
import org.scalatest.FunSuite

class PatternMatchingTest extends FunSuite {
  test("Same type pattern matching"){
    val patternMatching = new PatternMatching
    val num = patternMatching.matchColor("red")
    assert(num == 1)
  }

  test("Different type pattern matching"){
    val patternMatching = new PatternMatching
    val str = patternMatching.matchMixTypes(1)
    assert(str == "red")
  }

  test("Different type pattern matching - any Int"){
    val patternMatching = new PatternMatching
    val num = patternMatching.matchMixTypes(24)
    assert(num == "Dowolna całkowita")
  }
}


