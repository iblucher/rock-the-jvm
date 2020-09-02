package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial (n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need the factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
//  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the last expression

    factorialHelper(n, 1)
  }

  /*
    anotherFactorial(10) = factorialHelper(10, 1)
    = factorialHelper(9, 10 * 1)
    = factorialHelper(8, 9 * 10 * 1)
    = factorialHelper(7, 8 * 9 * 10 * 1)
    = ...
    = factorialHelper(2, 3 * 4 * ... * 10 * 1)
    = factorialHelper(1, 2 * ... * 10 * 1)
  */

//  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  /*
    1. Concatenate a string n times
    2. isPrime function tail recursive
    3. Fibonacci tail recursive
  */

  // 1 - string concatenation
  // ACCUMULATORS NEED TO HAVE THE SAME RETURN TYPE AS THE INTENDED RETURN TYPE OF THE FUNCTION!!!
  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)

  println(concatenateTailRec("hello", 3, ""))


  // 2 - isPrime with tail recursion
  def isPrimeTailRec(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(t: Int, accumulator: Boolean): Boolean =
      if (!accumulator) false
      else if (t <= 1) true
      else isPrimeHelper(t - 1, n % t != 0 && accumulator)

    isPrimeHelper(n / 2, true)
  }

  println(isPrimeTailRec(7))
  println(isPrimeTailRec(15))
  println(isPrimeTailRec(2003))


  // 3 - fibonacci tail rec
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibonacciTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }

  println(fibonacci(8))

}
