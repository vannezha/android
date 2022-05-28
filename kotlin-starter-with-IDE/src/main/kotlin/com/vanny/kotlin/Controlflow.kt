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

enum class Color (val budi :Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
}