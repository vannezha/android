fun main(){
    var user1 = DataUser("ucup",17)
    var user2 = DataUser("ucup",17)
    var user3 = Userr("ucup",17)
    var user4 = User("ucup",17)
//    we can copy and change a value of object easly with copy method
    var user5 = user1.copy(umur=20)

    println(user1)
    println(user2)
//    before we override original function
    println(user3)
//    after we override original function
    println(user4)
    println(user1.equals(user2))
    println(user1.equals(user3))
    println(user5)

//  destructuring declarations (there are 3 way)
//    first (data classes will automatically provide us componentN, where N are the number of our parameters)
    var nama = user1.component1()
    var umur = user1.component2()
    println("Hi my name is $nama, i am $umur years old.")
//    second
    var (nama1, umur1) = user1
    println("Hi my name is $nama1, i am $umur1 years old.")
//    third (using method of class, we should define the method first)
    user1.intro()

}

// task 1 (data class)
//    data classes are like an ordinary class that have a role as data container
//    data classes dont have any logic nor functionality but handling data
//    we declare "data" first before write "class" like this
data class DataUser(val nama:String, val umur:Int){
    fun intro(){
        println("Hi my name is $nama, i am $umur years old.")
    }
}
//    nb : we must initiate type of variable in this case,
//          constructor must have parameter, at least 1
//          all main constructor need to declare as var or val
//          modifier of data class cant be abstract, open, sealed or inner
//    only one line code like that, compiler automatically give us
//    constuctor, toString, equals, hashCode, copy, and componentN method

//    without data class
class User(val nama:String, val umur:Int){
//    we need overide the original function if we dont use data class
    override fun toString(): String {
        return "User(nama=$nama, umur=$umur)"
    }
}
class Userr(val nama:String, val umur:Int)