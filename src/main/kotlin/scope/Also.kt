package org.example.scope

import org.example.Person

fun main() {
    val person = Person().apply {
        this.name = "Miyakon"
    }.also { println(it) }.apply { age = 28 }.also{ println(it) }

    println(person)
}