package org.example.scope

import org.example.Person

fun main() {
    val person = Person().apply {
        this.name = "Miyakon"
        age = 28
    }

    val list = mutableListOf<String>().apply {
        add("Miyakon")
        add("tatsu")
    }

    println(person)
    println(list)
}