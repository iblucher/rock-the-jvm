package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types (types of vals are optional)

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort:Short = 4613
  val aLong:Long = 238749823479238L
  val aFloat:Float = 2.0f
  val aDouble:Double = 3.14

  // variables (mutable: can be reassigned)
  var aVariable: Int = 4

  aVariable = 5 // side effects (be mindful of side effects from now on)
}
