package net.print.kotlin

fun main(args: Array<String>) {
    //sayHello()
    //test()
    //test2()
    test3()
}
// 基本数据类型
fun sayHello(): Unit{
    println("hello World")
    // 布尔
    val aBoolean: Boolean = true
    val anotherBoolean:Boolean = false

    // 短整型
    val maxShort:Short = Short.MAX_VALUE
    val minShort:Short = Short.MIN_VALUE

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

    // byte
    val aByte:Byte = 127        // 一位 8字节 应该表示 2^8 = -128-127   256


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

    println(maxShort)
    println(minShort)
}

// 拆箱和装箱 devan encasement bin  字符串
fun test():Unit{
    val aChar:Char = 'a'
    val bChar:Char = '\u000f'

    val aString:String = "hello"
    // 字符数组构造字符串
    var bString:String = String(charArrayOf('h','e','l','l','o'))

    println(bChar)
    println(aString)
    println(bString)
    println(aString == bString)     // true   equals
    println(aString === bString)     // false 比较地址
    print("hello"+"world")

    var aInt:Int = 1
    var bInt:Int = 2
    println("$aInt + $bInt = ${aInt + bInt}")

    println("hello \"aqie\" \$648")

    var rawString:String = """
        \t
        \n
     """
    println(rawString)
    println(rawString.length)


}

// 类与对象
fun test2():Unit{
    var 我喜欢的妹子:妹子 = 妹子("温柔","甜美","嘤嘤嘤")
    print(我喜欢的妹子 is 人)
}

open class 人(var 性格:String,var 长相:String,var 声音:String){
    init {
        print("${this.javaClass.simpleName}：性格 $性格,长相 $长相,声音, $声音")
    }
}

class 妹子(性格:String,长相:String,声音:String):人(性格,长相,声音)

class 帅哥(性格:String,长相:String,声音:String):人(性格,长相,声音)


fun test3():Unit{
    var name = getName()?:return        // 如果name 为null 返回
    print(getName()?.length)

    var value:String ?= "abcd"          // 这里定义可能出现null
    print(value!!.length)               // 肯定不是null,可以打印
}
fun getName():String?{
    return null
}



