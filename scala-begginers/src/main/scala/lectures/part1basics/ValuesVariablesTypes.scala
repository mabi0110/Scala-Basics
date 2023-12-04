package lectures.part1basics

object ValuesVariablesTypes extends App {

  // val - values
  // val is immutable = can't be reassigned
  // types of val are optional

  val x: Int = 42
  println(x)

  val y = 54
  println(y)

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  var aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4653
  val aLong: Long = 5347299283743332L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // var - variables
  // var is mutable
  var aVariable: Int = 4
  aVariable = 5




}
