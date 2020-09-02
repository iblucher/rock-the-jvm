package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{

  @tailrec
  def factorialHelper(x: Int, accumulator: Int = 1): BigInt =
    if (x <= 1) accumulator
    else factorialHelper(x - 1, x * accumulator)

  val fact10 = factorialHelper(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)

  /*
    1. pass in every leading argument
    2. name the arguments
   */

  savePicture(height = 600, width = 800, format = "bmp")

}
