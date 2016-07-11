package com.tairan.zt.test.day1

import scala.annotation.tailrec
import scala.collection.mutable

/**
 * Created by hzzt on 2016/7/11.
 */
object Factorial {
  def main(args: Array[String]) {
    def factorial(i:Int):Long={
      @tailrec
      def fact(i:Int,accumulator: Int):Long={
        if (i<=1) accumulator
        else fact(i-1,i*accumulator)
      }
      fact(i,1)
    }
    //(0 to 5) foreach(i=>println(factorial(i)))

    def countTo(n:Int):Unit={
      def count(i:Int):Unit={
        if (i<=n) {
          println(i)
          count(i + 1)
        }
      }
      count(1)
    }
   // countTo(3)

    val intToStringMap = new mutable.HashMap[String,String];
    intToStringMap.put("name","zhangtong");
    intToStringMap.put("age","27")

    val set  = intToStringMap.keysIterator;
    while(set.hasNext){
      println(intToStringMap.get(set.next()))
    }

  }
}
