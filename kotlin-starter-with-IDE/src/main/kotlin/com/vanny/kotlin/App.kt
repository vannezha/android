package com.vanny.kotlin

import kotlin.reflect.typeOf

// single line comment

/*
multiline
comment
*/

fun main() {
//    task 1
    println("Hello kotlin")

//    task 2
    val name = "Vanny"
    print("Hello my name is ")
    println(name)
    println(if (true) "always uwun't" else "always uwu")

//    task 3 (var and val)
/*
*  we can change variable value if we initiate it
* with var keyword,
* otherwise val cant
*/
    var nama = "Vanny uwu"
    nama = "uwu Vanny"
//    name = "uwu"  --> if we run this will throw an
//    error because we have initiated variable "name" with val keyword
//    nb : val must be inititated its value before

//    task 4 (variable structure)
    var jeneng : String = "budi sans"
//    var/val = controll value
//    jeneng = identifier
//    String = type of variable we want intiate (we can ignore it since kotlin static type)
//    "budi sans" = initialization

//    task 5 (data type determine its operation that can be used)
    val kata1 :String= "aku suka"
    val kata2 = "kucing yang"
    val kata3 = "ga garong"
    println(kata1 + " " + kata2 + " " +kata3)
// it will give us different result if our variable not string like this
    val angka1 :Int = 12
    val angka2 = 4.0
    println(angka1 + angka2)

//    task 6 (char)
//    char is like string but with '' instead of "",
//    and we can doing increment or decrement with it
//    since char is basically just unicode, for instance :
//    A = 0041 if we doing increment it will give us 0042 which is B
    var char_nih_bang : Char = 'A'
    println("Ini huruf apa adek adek ? "+char_nih_bang)
    println("Ini huruf apa adek adek ? "+char_nih_bang++) // anyway idk why it still return A
    println("Ini huruf apa adek adek ? "+char_nih_bang++)
    println("Ini huruf apa adek adek ? "+char_nih_bang++)
    println("Ini huruf apa adek adek ? "+char_nih_bang--)
    println("Ini huruf apa adek adek ? "+char_nih_bang--)
    println("Ini huruf apa adek adek ? "+char_nih_bang--)
    println("Ini huruf apa adek adek ? "+char_nih_bang--)

// task 6 (string)
// string bassically is an array set of char (unicode)
// thats explained us why we can access element of string by index (indexing)
    val string_nih = "Ucup"
    val string_nah = string_nih[1] + string_nih[2].toString() + string_nih[3].toString()
    println("Si " +
            string_nih +
            " \"si paling tidak keren\". " +
            string_nah.uppercase() +
            string_nah.reversed().uppercase()
    )
// define print_kotlin function
    fun print_ucup(){
        val name = """
            Ucup
            si
            anak
            nakal,
            suka
            mencuri
            tugu
            pancoran
        """.trimIndent()
        for (i in name){
            if (i == '\n'){
                print(" ")
            } else{
                print(i)
            }
        }
    println()
    }
//    call function above
    print_ucup()

//    task 7 (function)
//    here is the default structure of kotlin function
//    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//    return result
//    }
    fun nama1(nama:String):String{
        return "nama saya $nama"
    }
    println(nama1("otong"))

//    we can type function like this if utility of this function just to return something
//    fun functionName(param1: Type1, param2: Type2, ...): ReturnType = ReturnValue
    fun nama2(nama:String):String="nama saya $nama"
    println(nama2("otong2"))
//    we can declare function inside or outside main function :3
    println(aku())

//    kotlin can make a function without returntype as well with change returntype to "Unit"
//    or we can ignore it since kotlin think it is redundant thing
    akudenganUnit()
    akutanpaUnit() //check detail function bellow

// task 8 (if-else)
    val angka3 = 3
    var angka:Int? = 2 // we will learn null safety later
    if (angka3 > 10){
        angka = angka3
    }else if(angka3 > 5){
        angka = 5
    }else{
        angka = null
    }
    println("ini nilai dari angka $angka")

//    task 9 (boolean)
    val gateopen = 7
    val gateclose = 22
    var now = 19
    val isOpen = now >= gateopen && now <= gateclose
    val isgatemove = now == gateopen || now == gateclose
    val isnotSame = gateopen != gateclose

//    task 10 (number)
//    because i learn python a lot before. here is my way to remember number type in kotlin
//    usually in python we just use int or float without any fafifu
//    int64 = Long
    var angka4 = 123L
    println(angka4)
//    int32 = Int
    var angka5 = 123
    println(angka5)
//    int16 = Short
    var angka6 = 123
    println(angka6)
//    int8 = Byte
    val bytenum = 0b11010010
    println(bytenum)
//    float64 = Double
//    15-16 behind commas
    val doubleNumber: Double = 1.3
//    float32 = Float
//    6-7 behind commas
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

//    casting datatype
    var tenK = 10_000 //readable integer (kotlin feature)
    println(tenK.toString())
    println(tenK.toInt())
    println(tenK.toByte())
    println(tenK.toChar())
    println(tenK.toFloat())
    println(tenK.toDouble())
    println(tenK.toLong())
    println(tenK.toShort())

//    task 11 (array) --> like string explisitly
//    traditional array writing in kotlin (we can ignore it)
//    intArrayOf() : IntArray
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray
    val array1 = arrayOf(1,2,3,4)
    array1[2] = 12 // we can do this because we change value inside array, not that array
    val array2 = arrayOf(1,2,"ujang", "selalu", false)
    println(array1[2])
    println(array2[4])
    val array3 = Array(10, {x -> x * x}) // 2nd parameter called lambda function, we learn after this
    for (i in array3){
        println(i)
    }

//    task 12 (NPE/ null pointer exception)
    val string_nih_ngab1 :String?= null // question mark after datatype mean that variable can store null value (nullable)
//    how to face this situation using if-else (traditional way)
    if (string_nih_ngab1 != null){
        println(string_nih_ngab1.length)
    }else{
        println("do whatever you want")
    }

//    handling nullable variable using save calls "?." and elvis operator "?:"
//    save calls are used to anticipate (will skip it when face it) null value in variable
//    elvis operator is like what we will do if our variable contain null value. for instance :

    println(string_nih_ngab1?.length ?: "do whatever you want (using save calls and elvis operator)")

//    task 13 (string template)
//    string template : we can insert a variable without concatenate it
    println("perkenalkan namaku ${nama.uppercase()}, umurku ${(angka1+angka2).toInt()} tahun")

    
}



fun aku():String="Aku uwu sekaliiiiiii... ihihihi"
fun akudenganUnit():Unit{
    println("no return value with Unit")
}

fun akutanpaUnit(){
    println("no return value without Unit nih ngab")
}