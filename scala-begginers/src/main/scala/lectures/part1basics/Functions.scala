package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " - " + b
  }
  println(aFunction("cat", 20))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("hello world ", 3))

  // when you need loops, use recursion

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)
  aFunctionWithSideEffect("something to print")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int) : Int = a + b

    aSmallerFunction(n, n - 1)
  }
  println(aBigFunction(6))

  def aGreetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }
  println(aGreetingFunction("Go", 20))

  def aFactorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorialFunction(n - 1)
  }
  println(aFactorialFunction(5))

  def aFibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }
  println(aFibonacciFunction(5))

  def isPrimeFunction(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println(isPrimeFunction(37))
  println(isPrimeFunction(2003))
  println(isPrimeFunction(2*8))


}
