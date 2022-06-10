package com.vanny.kotlin

// this is how to import KProperty class from kotlin.reflect package
import kotlin.reflect.KProperty
import kotlin.random.Random
import kotlin.math.PI as pi
import kotlin.math.cos as cosinus
import kotlin.math.*
import com.vanny.custompackage.saySomething
import com.vanny.custompackage.saySomething1 as custom

fun main(){
    val kucing = Animal(nama = "kucing", umur = 12, true)
    kucing.makan()
    kucing.jeneng = "budi"
    println(kucing.jeneng)

    println()

//    this delegate property material take time a lot to learn :), and i think i am not really undertood. for now i will skipp it
//    ??????????????????????????????????????????????????????????????????????????????????????????????????
//    ??????????????????????????????????? LEARN THIS MATERIAL AGAIN ????????????????????????????????????
//    ??????????????????????????????????????????????????????????????????????????????????????????????????
    val pitek = Hewan()
    println(pitek.age)
    pitek.age = 20

    println()
    DelegateGenericClass().hahahihi()
    println()

//    extentions property
    val macan = Animal()
    println(macan.getAnimalInfo)
    println()

//    constructor
//    there are 2 type of constructor in kotlin (primary and secondary)
//    1. Primary
    val contohprimaryconstructor = PrimaryConstructor(nama = "budi", umur = 20)
    println(contohprimaryconstructor.getInfo)
//    2. Secondary
    val contohsecondaryconstructor = SecondaryConstructor(nama = "tatang suratang", umur = 99)
    val contohsecondaryconstructor1 = SecondaryConstructor(nama = "ucuy surucuy", umur = 20, hidup = true)
    println(contohsecondaryconstructor.getInfo)
    println(contohsecondaryconstructor1.getInfo)

    println()

//    VISIBILITY MODIFIER (like C but there is internal) -> public, private, protected, internal
//    1. public (default modifier in kotlin is public)
    val contohpublik = PublicClass()
    println("we can access their atribute directly like this ${contohpublik.nama}")

//    2. private
    val contohprivate = PrivateClass()
    println("we cant access their atribute directly, but we can use getter setter instead")
    println(contohprivate.getNama())
    println(contohprivate.setNama("Halo Ini Budi"))
    println(contohprivate.getNama())
    println()

//    3. protected
    val contohprotected = ProtectedClass()
    println(contohprotected.getName())
    println()

//    4. internal
//    we can only access class with internal modifier in the same modul
    val contohinternal = InternalClass()
    println(contohinternal.nama)
    println()


//    INHERITANCE
//    basically class in kotlin is written in "final" form so we need to change it to "open" form to able to extend it
    val rednot8 = Redmi("Redmi Note 8 Pro", 4_000_000, 2019)
    rednot8.getInfo()
    rednot8.whoami()
    println()

//    OVERLOADING
//    basically this concept remain same,because i learn OOP in C as well
    rednot8.whoami()
    rednot8.whoami("THIS IS EXAMPLE OF OVERLOADING IN whoami() function")
    println()

//    ABSTRACT class
//    nb : difference between open and abstract class is that open can be subclassed while abstract must be subclassed
//    val contohabstractclass = HP("Xiaomi Poco X4 Pro", 4_500_000)
//    code above will throw an error since HP class is just abstract class
//    we can use it if modifier abstract is changed to open instead, but i will not do it.

//    INTERFACE
//    this is like abstract class but we must override all
//    function and property in it, and we may not initiate a value in their property
    val mawar = Mawar("merah")
    mawar.getInfo()
    println()

//    Import and Packages (line 3-8 already explain it)

//    Custom Package and call it
    com.vanny.kotlin.saySomething()
    saySomething()
    custom()
    println()

//    EXCEPTION & how to handle it (try-catch-finally block)
//    several exception that often appear is like ArithmeticException, NumberFormatException, NullPointerException
    val contohexception : Int? = null
    var contohexception1 : Int = 0
    try {
        contohexception1 = contohexception!!.toInt()
    }catch (e: NullPointerException){
        contohexception1 = 0
    }catch (e: NumberFormatException){
        contohexception1 = 1
    }finally {
        when(contohexception1){
            0 -> println("NullPointerException was called")
            1 -> println("NumberFormatException was called")
            else -> println(contohexception1)
        }
    }

//    operator -> overloading





}
// =====================================================================================================================
// =====================================================================================================================

class Animal(
    val nama:String = "kucing garonk",
    val umur:Int = 12,
    val masihhidup:Boolean = true
){
    var jeneng = nama

    get(){
        println("getter was called")
        return field
    }
    set(value){
        println("settter was called")
        field = value
    }
    fun makan(){
        println("$nama lagi makan")
    }
    fun tidur(){
        println("Si $nama lagi rebahan")
    }

}

val Animal.getAnimalInfo : String
    get() = "nama : ${this.nama}, umur : ${this.umur}, hidup : ${this.masihhidup}"

// property delegation
class DelegateGenericClass{
    private var nilai : Any = "Default"
    operator fun getValue(classreff : Any, property : KProperty<*>):Any{
        println("this function like getter to \"${property.name}\" property in \"${classreff}\" class.")
        return nilai
    }
    operator fun setValue(classreff: Any, property: KProperty<*>, newvalue:Any){
        println("\"${property.name}\" value from : \"${nilai}\" will change to be \"${newvalue}\"")
        nilai = newvalue
    }

    fun hahahihi(){
        println("this is just hahahihi function.")
    }
}

class Hewan{
    var name : Any by DelegateGenericClass()
    var weight : Any by DelegateGenericClass()
    var age : Any by DelegateGenericClass()

}

class PrimaryConstructor(nama:String,umur: Int){
    val nama : String
    val umur : Int

    init {
        this.nama = nama
        this.umur = umur
    }
}

val PrimaryConstructor.getInfo : String
    get(){
        return "PRIMARY CONSTUCTOR\nnama : ${this.nama} , umur : ${this.umur}"
    }

class SecondaryConstructor(nama:String,umur: Int){
    val nama : String
    val umur : Int
    var hidup : Boolean

    init {
        this.nama = nama
        this.umur = umur
        this.hidup = false

    }

    constructor(nama:String, umur: Int,hidup:Boolean) : this(nama,umur){
        this.hidup = hidup
    }
}
val SecondaryConstructor.getInfo : String
    get() = "SECONDARY CONSTRUCTOR\nnama:${this.nama} , umur:${this.umur}, hidup:${this.hidup}"

class PublicClass{
    public val nama:String = "Public Class"
}

class PrivateClass{
    private var nama:String = "Private Class"
    fun getNama(): String {
        return this.nama
    }
    fun setNama(value:String):String {
        this.nama = value
        return "setter was called"
    }
}

open class AbstractProtectedClass{
    protected var nama = "Protected Class"
}

class ProtectedClass(): AbstractProtectedClass(){
    fun getName(): String {
        return this.nama
    }
}

internal class InternalClass{
    internal val nama = "Internal Class"
}

abstract class HP(var nama:String, var harga:Int){
    init{
        var nama = nama
        var harga = harga
    }
    fun getInfo(){
        println("nama : $nama , harga : $harga")
    }
}

class Redmi(var pnama:String, var pharga:Int, var pkeluaran:Int):HP(pnama,pharga){
    fun whoami(){
        println("nama : ${this.pnama} , harga : ${this.pharga} , keluaran tahun : ${this.pkeluaran}")
    }
    fun whoami(header:String){
        println("$header\nnama : ${this.pnama} , harga : ${this.pharga} , keluaran tahun : ${this.pkeluaran}")
    }
}

// best practice when naming an interface class is by laid "i" capital letter in first word
interface IBunga{
    fun getInfo() {}
    var warna : String
}

class Mawar(override var warna: String): IBunga {
    override fun getInfo(){
        println("warna mawar adalah ${this.warna}")
    }
}