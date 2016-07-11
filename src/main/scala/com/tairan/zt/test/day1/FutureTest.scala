package com.tairan.zt.test.day1

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
/**
 * Created by hzzt on 2016/7/11.
 */
object FutureTest {
  def main(args: Array[String]) {
    def sleep(millis:Long)={
      Thread.sleep(millis)
    }
    def doWork(index:Int)={
      sleep((math.random*1000).toLong)
      index
    }
    (1 to 5) foreach{index =>
      val future = Future{
        doWork(index)
      }
      future onSuccess{
        case answer:Int => println(s"Success! return:$answer")
      }
      future onFailure{
        case th:Throwable=>println(s"FAILURE! return:$th")
      }
    }
    sleep(1000)
    println("finito")
  }
}