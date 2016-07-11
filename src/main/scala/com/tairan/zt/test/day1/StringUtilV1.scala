package com.tairan.zt.test.day1

/**
 * Created by hzzt on 2016/7/11.
 */
object StringUtilV1 {
  def joiner(strings:String*):String = strings.mkString("-")
  def joiner(strings:List[String]):String= joiner(strings:_*)

  def makeList(strings:String*) ={
    if (strings.length==0)
      Nil
    else
      strings.toList
  }
  def main(args: Array[String]): Unit = {
    println( StringUtilV1.joiner(List("Programming", "Scala")) )

    val list:List[String]=makeList("zhangtong","is a good boy")
    list.foreach(println(_))

    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 2, 0),
        List(0, 0, 3)
      )
    println(dim(1)(1))

    val t1: Tuple2[Int, String] = (1, "zhangtong")
    println(t1._2)
  }
}
