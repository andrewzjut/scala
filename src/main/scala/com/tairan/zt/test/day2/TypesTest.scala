package com.tairan.zt.test.day2

import java.io._

/**
 * Created by hzzt on 2016/7/12.
 */
object TypesTest {
  def main(args: Array[String]) {
    println(new StringBulkReader("hello world").read)
    println(new FileBulkReader(new File("D:\\workspace\\scala\\README.md")).read)
  }
}

abstract class BulkReader2[In] {
  val source: In

  def read: String
}

abstract class BulkReader {
  type In
  val source: In

  def read: String
}

class StringBulkReader(val source: String) extends BulkReader2[String] {
  //type In = String
  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader2[File] {
  // type In = File
  def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}