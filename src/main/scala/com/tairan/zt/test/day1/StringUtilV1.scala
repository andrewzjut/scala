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
  }
}
