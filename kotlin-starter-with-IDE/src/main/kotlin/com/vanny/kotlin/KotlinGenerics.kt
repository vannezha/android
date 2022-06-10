package com.vanny.kotlin


fun main(){
//    GENERICS
    val someString = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(someString.get(1))
//    <Int> this part called generic and in this case it is a default generic in kotlin
//    we can create more specific generic in kotlin as well
//    anyway.. "<>" , this is called angel brackets, so yeah dont forget it
//    well, i think generic is like "Any" but different, i mean it is different with "any" but kinda same. IDK how to explain it :)

//    GENERIC CLASS
    val contohgeneric1 :ContohGeneric<Int> =  ContohGeneric<Int>(123)
    val contohgeneric2 = ContohGeneric<String>("BUDIMAN")
    contohgeneric1.printSomething()
    contohgeneric2.printSomething()

//    GENERIC FUNCTION
//    this material is quite hard for me, must learn again :)
//    what i read is generic function has a differen structure with generic class, like this
//    fun <T> name():T{}

//    TYPE CONSTRAINT
//    fun <T : Number> name():T{}
//    code above mean that we just can pass T with Number and their child
    fun <T:Number> List<T>.penjumlahan(){
    println("okay this is work")
}
    val listangka1 = listOf<Long>(1,2,3,4)
    val listangka2 = listOf<Int>(1,2,3,4)
    val listangka3 = listOf<Float>(1.1F, 2.2F, 3.3F, 4.4F)
    listangka1.penjumlahan()
    listangka2.penjumlahan()
    listangka3.penjumlahan()
    println()


//    VARIANCE -> subclass that inheret parent class can be subtituted by other subclass that inheret same parent class
//    COVARIANT -> same as variance with generic
//    CONTRAVARIANT -> same as COVARIANT but the generic can be used to as variable that covariant cant



}


// =====================================================================================================================
// =====================================================================================================================
// =====================================================================================================================

class ContohGeneric<T>(val something:T){
    fun printSomething(){
        println("The value of something is ${something}. This is produced using generic\n")
    }
}




