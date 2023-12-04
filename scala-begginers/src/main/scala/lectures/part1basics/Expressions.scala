package lectures.part1basics

object Expressions extends App {

  // expression
  val x = 1 + 2
  println(x)

  // + - * / & | ^ << >> >>> (right shift with zero extension)
  println(2 + 3 * 4)

  // == != > >= < <=
  println(1 == x)

  // ! && ||
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // instructions (do) vs expressions (value)

  // if expression
  val aCondition = true
  val aValue = if(aCondition) 5 else 3
  println(aValue)

  var i  = 0
  val aWhile = while(i < 10) {
    println(i)
    i += 1
  }

  // everything in Scala is an expression
  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // code blocks
  val aCodeBlocks = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 882
    42
  }

  println(someOtherValue)

}
