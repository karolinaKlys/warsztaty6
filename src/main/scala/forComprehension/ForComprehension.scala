package forComprehension
import cats.Cat

class ForComprehension {

  def createList(): List[Cat] = {
    val catsList: List[Cat] =
      List(new Cat("Wanilia", 3, "grey"),
        Cat("Paul", 4.5, "orange"),
        Cat("Antoni", 5, "black"),
        Cat("Coco", 2.5, "white"),
        Cat("Zachary", 5, "red"),
        Cat("Princess", 3.6, "black"),
        Cat("Vera", 2.7, "white"),
        Cat("Gold", 4.2, "orange"),
        Cat("Lion", 3.4, "orange"),
        Cat("Olaf", 3, "grey"))
    return catsList
  }

  def versionWithSugar(minCatWeight: Double, maxCatWeight: Double, catList: List[Cat]): List[String] ={
    val catNames = for (
      cat <- catList if(cat.weight > minCatWeight && cat.weight <= maxCatWeight)
    ) yield cat.name
    return catNames
  }

  def versionWithoutSugar(minCatWeight: Double, maxCatWeight: Double, catList: List[Cat]): List[String] ={
    var catNames: List[String] = catList.filter(_.weight > minCatWeight).filter(_.weight <= maxCatWeight)
      .collect(_.name)
    return catNames
  }

  def multipleGenerators(n: Int) = {
    for (
      i <- 0 until n;
      j <- 0 until n if i == j
    ) yield (i, j)
  }

  def optionSugar(): Option[Cat] = {
    val nameOpt: Option[String] = Some("Paul")
    //val colorOpt: Option[String] = Some("orange")
    val colorOpt: Option[String] = None
    val weightOpt: Option[Double] = Some(3.5)

    val cat = for {
      name <- nameOpt
      color <- colorOpt
      weight <- weightOpt
    } yield Cat(name, weight, color)
    return cat
  }

  //flatMap
  def flatMapWithoutSugar(list: List[Cat]): List[Char] = {
    val listNames: List[Char]  = list.flatMap(Cat => Cat.name.toLowerCase)
    return listNames
  }

  def flatMapWithSugar(list: List[Cat]): List[String] = {
    val listNames: List[String] = for (nameCat <- list) yield nameCat.name.toLowerCase
    return listNames
  }

  //Map
  def mapWithoutSugar(list: List[Cat]): List[Double] = {
    val listWeights: List[Double]  = list.map(Cat => Cat.weight*2)
    return listWeights
  }

  def mapWithSugar(list: List[Cat]): List[Double] = {
    val listWeights: List[Double] = for (cat <- list) yield cat.weight*2
    return listWeights
  }
}