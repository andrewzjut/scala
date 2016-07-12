package com.tairan.zt.test.day1

/**
 * Created by hzzt on 2016/7/11.
 */
object OptionTest extends App {
  val stateCapitals = Map(
    "alabama" -> "mantgomery",
    "alaska" -> "juneau",
    "wyoming" -> "cheyenne"
  )

  println(stateCapitals.get("alabama").get)
  println(stateCapitals.get("Unknow").getOrElse("oops"))
  List
}
