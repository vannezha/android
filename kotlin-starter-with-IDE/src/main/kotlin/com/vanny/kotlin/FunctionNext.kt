package com.vanny.kotlin

fun main(){
//    1. fold & foldRight
//    in my opinion fold is like you free to choose what operation you want on your list and dont forget its initial as well
//    fold need 2 argument (initial and lambda function. That lambda will need 2 parameter aswell "current" and "item")
    val fold1 = numbers.fold(10){current, item ->
        println("current is $current")
        println("item is $item")
        item+current}
    println("fold1 result is $fold1")

    val fold2 = numbers.foldRight(10){item, current ->
        println("current is $current")
        println("item is $item")
        item + current}
    println("fold2 result is $fold2")


//    2. drop, dropLast, dropWhile, dropLastWhile
//    it will require 1 argument (how many item we want to drop)
    println(numbers.drop(3))
    println(numbers.dropLast(3))
    println(numbers.dropLastWhile { it % 2 == 0 }) // drop last element with filter "while"
    println(numbers.dropWhile { it % 2 + 1 == 2 }) // drop first element

//    3. Take
//    take just like drop, but in opposite meaning
    println("\nthis is take example")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.takeLastWhile { it % 5 == 0 })
    println(numbers.takeWhile { it % 2 +1 == 2})
    println(numbers.takeIf { 3 in numbers })
    println(numbers.takeUnless { 3 in numbers }) // return null

//    4. Slice
//    it will need 1 parameter, it can be range type or list
    println("\nthis is example how to use slice")
    println(numbers.slice(2..7))
    println(numbers.slice(2..10 step 3))
    println(numbers.slice(ambil)) // ambil just list of number 2,3 and 7
    println(numbers.slice(listOf(2,3,7)))

//    5. Distinct
//    this is like set but in list version, this will force our list return unique value only
    println("\nthis is example of distinct")

    println(numbers.distinct())
    println(numbers.distinctBy {it.div(2)})

//    6. Chunked
    println("\nthis is example of chunked")
    println(numbers.chunked(3))
    println(numbers.chunked(4){
        it.toString().length
    })


//    Recursion
//    this is ordinary recursion (kotlin receive a ton of frame that not calculated yet) - intense memmory consumption
    fun rekursifbiasa(i:Int):Int{
        return if(i == 1){
            i
        }else{
            i*rekursifbiasa(i-1)
        }
    }
    println("\nthis is example of recurtion")
    println(rekursifbiasa(5))
//    using tail recursive (recommended way in kotlin)
//    this tailrec function may only call to run in end operation, and cant be laid in try-catch-finally block (idk why)
    tailrec fun rekursiftail(i:Int, hasil:Int=1):Int{
        var hasilsementara = i * hasil
        return if(i == 1){
            hasilsementara
        }else{
            rekursiftail(i-1,hasilsementara)
        }
    }
    println(rekursiftail(5))






}
// =====================================================================================================================
// =====================================================================================================================
// =====================================================================================================================
val numbers = listOf(1,2,1,4,5,6,5,8,9,10)
val ambil = listOf(2,3,7)