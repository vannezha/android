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
//    nb : val must be inititated its value
}