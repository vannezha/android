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
        else -> {
            println("color cant be find")
            "this \"else\" will return this line after print something"
        }
    }
//    we can use "is" and "in" like python as well
    var tipe = "hahahihi"
    when(tipe){
        is String -> println("ini string")
        else -> println("bukan string")
    }
    var range = 10..100
    when (val rentang = 33){
        in range -> println("$rentang didalam range")
        else -> println("$rentang tidak didalam range")
    }

//    task 2 (expression and statement)
//    expression doesnt do initialitate, return or calculate something, statement otherwise
//    like if-else, it is can be written as expression or statement (tenary but in different order if we learn python)
//    because expression just like ordinary if-else, i'll skip it. this is if-else statement
    val kebenaran = if (true) "ini statement true" else "ini statement false" // tenary : trueaction if truecond else falseaction
    println(kebenaran)


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