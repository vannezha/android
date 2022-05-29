package com.vanny.kotlin

fun main(){
// task 1 (list)
//    default value list in kotlin (listOf) is set to immutable, we can assume kotlin list equal to tuple in python
//    if we want to change it to mutable we should define it as mutableListOf -> its behaviour is same as list in python
    val list : List<Any> = listOf(1,'A',"ucup surucup", DummyUser("otong surotong"),false)
//    list[1] = 'B' -> will throw an error because default "list" is immutable
//    of course we can ignore type above, i want to write it to know how it work defaultly
    println(list)
    val mutablelist = mutableListOf(1,'A',"ucup surucup", DummyUser("otong surotong"),false)
    mutablelist[3] = DummyUser("tatang suratang")
    mutablelist.add("add element to the last of list")
    mutablelist.add(1,"add element to the index 1 of list")
    mutablelist.removeAt(0) // remove index 0 of list
    println(mutablelist)

//    task 2 (set)
//    set just like list but have unique value for each element, it is ensure that set cant have duplicate value
    val set1 = setOf(1,'a',2,3,1,'1',true,3,3)
    val set2 = setOf('a',4,5,1)
    val set3 = setOf(1,2,3,'1',true,'a')
    println(set1)
    println(set3)
    println(set1 == set3)
    println(5 in set1)
    println(set1.union(set2))
    println(set1.intersect(set2))
//    additonal info : in mutableSetOf we can adding or removing an element but cant change the value of that element list

//    task 3 (map)
//    this data type remind me of dictionary in python and json
    val hutang = mapOf(
        "budi" to 10_000,
        "otong" to 100_000,
        "jamet" to 0
    )
    println(hutang.keys)
    println(hutang.values)
    println(hutang["otong"])
    println(hutang.getValue("otong"))
//    not recommended because return "null" kinda hard to tracked
    println(hutang["tatang"]) // will throw null value
//    recommended way (throw an exception directly in terminal make it easier to tracked)
//    println(hutang.getValue("tatang")) // will throw an exception

    val castToMutableMap = hutang.toMutableMap()
    castToMutableMap.put("udin",50_000)
    println(castToMutableMap)
//    not recomended way using mutable map but yeah, it is still work
    val mutableMap = mutableMapOf(
        "budi" to 10_000,
        "otong" to 100_000,
        "jamet" to 0,
        "udin" to 50_000
    )
    println(mutableMap)

//    task 4 (collections operations)
//    i just realized that range is different with list (doesnt like range in python), so yeah.. becareful
//    val listOfNumber = listOf(1..100)
    val listOfNumber = listOf(1,2,3,4,5,6,7,8,9,10)
//    "it" refer to each element in list, must be "it", okay
    println(listOfNumber.map { it * it }) // curly bracker is lambda function
    println(listOfNumber.filter { it % 3 ==0 })
    println(listOfNumber.filterNot { it % 3 == 0 })
    println(listOfNumber.count())
    println(listOfNumber.count{it % 3 == 0})
    println(listOfNumber.find { it % 3 == 4 })
//    firsrOrNull doing exactly same as find method
    println(listOfNumber.firstOrNull{it % 3 == 4})
    println(listOfNumber.lastOrNull())
//    first and last just like firsorNull and lasornull but return exceptions instead of null
//    println(listOfNumber.first{it % 3 == 4}) // throw an exceptions
    println(listOfNumber.last{it % 3 == 0})
    println(listOfNumber.sum())
    println(listOfNumber.sorted())
    println(listOfNumber.sortedDescending())

//    task 5 (sequences) - > lazy evaluation
//    map, list, set = eager evaluation
//    eager evaluation / horizontal evaluation = operations that really evaluate all possible event
//    lazy evaluation / vertical evaluation = operations that just evaluate items that needed
    eagerEvaluation() // it is really checked every possible event like 5 % 2 the result direclyt * 2 (false*2 in map will not be printed anyway)
    lazyevaluation() // see the difference speed to run it by converting list to sequence first before perform any operations
    println()

//    how to generate sequence (it will need 2 variable)
//    first variable is first element of sequence
//    second vatiable is lambda function as how the element will be generated
    val contohsequence = generateSequence (10){ it * 7 }
    contohsequence.take(10).forEach { print("$it ") }
    println()

    val contohsequence1 = sequenceOf(12,13,14,15)
    contohsequence1.forEach { i -> print("$i ") }
    println()



}

data class DummyUser(val nama:String?)

fun eagerEvaluation(){
    val list = (1..1_000_000).toList()
    list.filter { it % 10 == 0 }.map {it * 2}.forEach{ print("$it ") }
}

fun lazyevaluation(){
    val list = (1..1_000_000).toList()
    list.asSequence().filter { it % 10 == 0 }.map {it * 2}.forEach{ print("$it ") }
}