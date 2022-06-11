package com.vanny.kotlin

import kotlinx.coroutines.*

fun main()= runBlocking {
    launch {
        delay(1000L)
        println("Vanny Ezhaan Nur Sandika")
    }
    println("Hallo")
    delay(2000L)
}