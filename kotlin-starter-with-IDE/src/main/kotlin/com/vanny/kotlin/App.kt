package com.vanny.kotlin

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
}