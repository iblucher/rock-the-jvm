package lectures.part1basics

object CBNvsCBV extends App{

  // Long because that's the return type for time functions on the JVM
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // => tells the compiler the parameter will be called by name
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime()) // evaluates parameter expression before passing to function (same value used in the function)
  calledByName(System.nanoTime()) // expression is evaluated everytime it is used (two times in this case) - DELAYED EVALUATION

  // USEFUL IN LAZY STREAMS AND IN TASKS THAT MIGHT FAIL

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34)
  printFirst(34, infinite()) // since y is not used infinite() is never evaluated and doesn't create a stack overflow error


}
