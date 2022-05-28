package com.vanny.kotlin

fun main(){
    println("this is 2nd kotlin file to learn control flow in kotlin")

//    task 1 (enumeration) actually i really confused when learn it first time, so yeah. GANBATTE !!

//    this is our code looks like without enum
    val colorRed = 0xFF0000
    val colorGreen = 0x00FF00
    val colorBlue = 0x0000FF
    println("$colorRed $colorGreen $colorBlue")
//    using enum
    Warna.values().forEach { i -> if (true) println(i) else println("haha") }
    println("${Color.RED},${Color.GREEN},${Color.BLUE}")
    val color = Color.GREEN
    println(color.name)
    println(color.budi)
    println(color.ordinal)
    color.signal()
    Color.RED.signal()
    println(Color.RED.signal())
    Color.RED.privatefunction()
//nb : enum object can call function of enum class and can override it

//    when expression
    var warna = Color.RED
    when(warna){
        Color.RED -> println("color is RED")
        Color.GREEN -> println("color is GREEN")
        Color.BLUE -> println("color is BLUE")
    }

    


}

// task 1 class
enum class Warna{
    RED,GREEN,BLUE
}

enum class Color (val budi :Int?){
    RED(null){
                    override fun signal():Int?{
                        println("this is red signal")
                        return this?.budi ?: 123456
                    }
                 },
    GREEN(0x00FF00),
    BLUE(0x0000FF),;

//    we make this open because we need to override it (it is "final" if we are not "open" it)
    open fun signal() :Int?{
        println("this is default signal")
        return null
    }

    fun privatefunction(){
        println("this is private function")
    }

}