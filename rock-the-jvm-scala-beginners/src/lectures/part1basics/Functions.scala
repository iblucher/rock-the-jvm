package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction) // parameterless functions can be called just by name

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION. (do not use imperative code with Scala syntax)

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I amd $age years old"
    2. Factorial function 1 * 2 * 3 * ... * n (recursive)
    3. A Fibonacci function (recursive)
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
    4. Tests if a number is prime
   */

  // 1 - greeting function
  def greetingFunction(name: String, age: Int): Unit =
    println(s"Hi,my name is $name and I am $age years old")

  greetingFunction("Isabela", 24)

  // 2 - factorial function
  def aFactorialFunction(n: Int): Int =
    if (n == 1) 1
    else n * aFactorialFunction(n - 1)

  println(aFactorialFunction(1))
  println(aFactorialFunction(2))
  println(aFactorialFunction(3))
  println(aFactorialFunction(4))
  println(aFactorialFunction(5))

  // 3 - Fibonacci function
  def aFibonacciFunction(n: Int): Int =
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)

  println(aFibonacciFunction(1))
  println(aFibonacciFunction(2))
  println(aFibonacciFunction(3))
  println(aFibonacciFunction(4))
  println(aFibonacciFunction(10))

  // 4 - test if prime
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(23))
  println(isPrime(42))
  println(isPrime(37 * 17))

}
