package net.print.kotlin

fun main(args: Array<String>) {
    sayHello()
}
fun sayHello(): Unit{
    println("hello World")
    // 布尔
    val aBoolean: Boolean = true
    val anotherBoolean:Boolean = false

    // 整型
    val aInt: Int = 8
    val bInt: Int = 0xff
    val cInt: Int = 0b00000011

    // 长整型
    val alongInt:Long = 34824981821389088
    val maxLong:Long = Long.MAX_VALUE

    // 浮点
    val aFloat:Float= 2.0F
    val bFloat:Float = 1E3F     // 10 的三次方
    val maxFloat:Float = Float.MAX_VALUE    // 最大值    3.4028235E38
    val minFloat:Float = Float.MIN_VALUE   // 最小的正数 1.4E-45   1.4*10的-45次方
    val trueFloat:Float = -Float.MAX_VALUE

    // 双精度
    val aDouble:Double = 3.1415926
    val maxDouble:Double = Double.MAX_VALUE
    val minDouble:Double = Double.MIN_VALUE     // 最小的正数


    println(bInt)
    println(cInt)
    println(Int.MAX_VALUE)
    println(Math.pow(2.0,31.0) - 1)
    println(Int.MIN_VALUE)
    println(-Math.pow(2.0,31.0))

    println(123L)  // 默认整型 + L变长整型
    println(maxLong)
    println(Math.pow(2.0,63.0) - 1)
    println(aFloat)
    println(bFloat)
    println(maxFloat)
    println(minFloat)
    println(trueFloat)
    println(0.0F/0.0F == Float.NaN)   // NaN 和任何都不相等
    println(aDouble)

    println(maxDouble)
    println(minDouble)
}