package com.vanny.kotlin

fun main() {
//    as long as i learn function in kotlin quite same as C but we must define return type in first

//    task 1 (named argument/parameter and default argument)
    println(namedargument("uwu", "is", "vanny")) // without named argument
    println(namedargument(first = "vanny", third = "uwu", second = "is")) // with named argument
    println(namedargument(third = "uwu sekali")) // with default argument

//    task 2 (vararg)
//    in one function cant have more than 1 vararg
//    we can simplify several parameter that have same type to be single parameter like this
    val angka = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(angka)
    println(penjumlahan(angka))

    var hasil = aslist(angka)
    println(hasil.size)
    println()

//    task 3 (extentions)
//    there are 2 type of extentions (funtions and properties extentions)
//    function extentions
    println(100.printAngka())
//    properties extentions
    println(100.slice)
    var angka1: Int? = null
    println(angka1.slice)

//    task 4 (funtion type)
    println(penjumlahan?.invoke(1, 2, 3) ?: 0)
    println(perkalian?.invoke(2, 3, 4) ?: 0)

//    lambda / anon function
    val pesan: String? = null
    println(message(pesan))
    println(message("fafifufefo"))

//     higher order function
    printsomething(200, sum)
    printsomething(150) { value ->
        value + value
    }

//    lambda with argument & receiver
//    lambda with argument (let, also)
    println(buildstring())
    val nilai1 = "hallo"
    nilai1.let{
        println("$it vanny")
    }


//    several function that work with lambda receiver are run, with and apply (using this)
    val nilai2 = "hallo"
    nilai2.apply {
//        this lambda can access our class function, REMEMBER : CLASS  NOT OBJECT
        println(length)
    }
    var pesan1 = buildstringwithlambda {
    append("hello ")
    append("from ")
    append("lambda receiver")
    }
    println(pesan1)




//    scope function lambda receiver(this)
//    1. run
    val text1 = "hallo"
//    if our lambda have return value, the last line will be
    val hasil1:String = text1.run{
        println("replace text \"$this\" with \"${this.replace("hallo","kotlin")}\"")
        this
    }
    println(hasil1)

//    2. with
    val message1 = "halo saudara saudara"
    val result :String= with(message1){
        this
    }
    println(result)


//    3. apply
//    normal way
    val stringbuilder1 = StringBuilder()
    stringbuilder1.append("hi")
    stringbuilder1.append(" vanny uwu")
    println(stringbuilder1.toString())
//    lambda way
    val stringbuilder2 = StringBuilder().apply {
        append("hallo ")
        append("uwu vanny")
    }
    println(stringbuilder2.toString())




//    scope function lambda argument (it)
//    1. let & run
    val message2:String? = null
    val result1 = message2?.let{
        "text length are ${it.length}"
    }?:run{
        "there is no text, so there is no length as well"
    }
    println(result1)

//    2. aslo (like apply but return it instead of this)
    val text2 = "hallo"
    text2.also { println("$it kamu yang memperhatikanku uwuuuu") }









}
// =====================================================================================================================
// =====================================================================================================================
// =====================================================================================================================

//    function type
typealias Aritmatika = ((Int, Int, Int) -> Int)?
val penjumlahan : Aritmatika = {valueA, valueB, valueC -> valueA+valueB+valueC}
val perkalian : Aritmatika = {valueA, valueB, valueC -> valueA*valueB*valueC}



fun namedargument(first:String = "we", second:String = "are", third:String = "uwu"):String{
    return "$first $second $third"
}

fun penjumlahan(vararg angka: IntArray):Int{
    return angka[0].sum()
}

// woaa i still dont get what i write in code bellow
// i think my brain need upgrade to lastest version lmao
fun <V> aslist(vararg input: V): MutableList<V> {
    var result = mutableListOf<V>()
    for (item in input.toList())
        result.add(item)

    return result

}

fun Int.printAngka():Int{
    println("value $this")
    return this + 100
}

val Int?.slice:Int
    get() = this?.div(2) ?: 0

val message = {message:String? -> "ini ${message?:"pesan"} ditulis dengan lambda funtion ya kak"}

fun printsomething(value:Int, sum: (Int) -> Int){
    val nilai = sum(value)
    println(nilai)
}

var sum: (Int) -> Int = {value -> value + value}

fun buildstring():String{
    val buildstring = StringBuilder()
    buildstring.append("hallo ")
    buildstring.append("from ")
    buildstring.append("lambda")
    return buildstring.toString()
}

fun buildstringwithlambda(act: StringBuilder.() -> Unit):String{
    val result = StringBuilder()
    result.act()
    return result.toString()
}