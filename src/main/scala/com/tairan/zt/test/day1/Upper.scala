package com.tairan.zt.test.day1

/**
 * Created by hzzt on 2016/7/9.
 */
object Upper {
  def main(args: Array[String]) {
    args.map(_.toUpperCase).foreach(printf("%s ",_))
    println()
    val array:Array[String] = new  Array(5)
    array(0)="hello"
    array(0)="world"
    array.foreach(print(_))
    println()
    val p = new Person("zhangtong",27)
    println(p.name+" "+p.age)
    p.age=26
    println(p.name+" "+p.age)


    val pf1:PartialFunction[Any,String]={case s:String=>"yes"}
    val pf2:PartialFunction[Any,String]={case s:Double=>"yes"}

    val pf = pf1 orElse(pf2)

    def tryPF(x:Any,f:PartialFunction[Any,String]):String=
        try {
          f(x).toString
        }catch {
          case _:MatchError=>"Error"
        }

    def d(x:Any,f:PartialFunction[Any,String])=
         f.isDefinedAt(x).toString

    List("str",3,14,10).foreach(x=>
      printf("%-5s | %-5s | %-6s | %-5s | %-6s | %-5s | %-6s\n",x.toString,
      d(x,pf1),tryPF(x,pf1),d(x,pf2),tryPF(x,pf2),d(x,pf),tryPF(x,pf))
    )

  }
  class Person(val name:String,var age:Int)
}
