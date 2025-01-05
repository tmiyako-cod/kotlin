package org.example.scope

fun main() {
    val person = Person().apply {
        this.name = "Miyakon"
    }.also { println(it) }.apply { age = 28 }.also{ println(it) }

    println(person)
}