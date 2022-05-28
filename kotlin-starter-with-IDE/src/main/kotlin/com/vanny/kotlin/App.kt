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

//    kotlin can make a function without returntype as well with change return type to Unit
//    or we can ignore it since kotlin think its redundant thing
    akudenganUnit()
    akutanpaUnit() //check detail function bellow


}



fun aku():String="Aku uwu sekaliiiiiii... ihihihi"
fun akudenganUnit():Unit{
    println("no return value with Unit")
}

fun akutanpaUnit(){
    println("no return value without Unit nih ngab")
}