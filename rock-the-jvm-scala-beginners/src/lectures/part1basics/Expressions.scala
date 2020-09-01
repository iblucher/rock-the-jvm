package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION (evaluated to a value)
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (DO SOMETHING) vc Expressions (GIVE ME THE VALUE OF SOMETHING)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION (the IF in Scala is an expression)
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN. (loops are discouraged)
  // do not write imperative code with the Scala syntax

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning (expressions returning Unit)

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println((aCodeBlock))

  // 1. difference between "hello world" vs println("hello world")?
  // "hello world" is a string and println is an expression which returns a Unit
  // "hello world" is a value of type String, so they have different types
  // the print also has the side effect of printing the string to the console

  // 2. what are the values below?
  // val someValue = true
  // val someOtherValue = 42

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)

}
