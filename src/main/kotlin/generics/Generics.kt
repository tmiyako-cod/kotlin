package org.example.generics

class Generics<T>(val value: T)

fun main() {
    val generics = Generics("Hello")
    val generics2 = Generics(1)
    println(generics.value)
    println(generics2.value)

    val generics3 = Generics(Generics("Hello"))
    println(generics3.value.value)

    val generics4 = Generics<String>("Hello")
    println(generics4.value.uppercase())
}