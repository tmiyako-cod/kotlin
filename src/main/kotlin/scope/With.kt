package org.example.scope

import org.example.Person

val person = Person("Miyakon", 28)
val person2 = Person("tatsu", 30)

fun main() {
    val result = with(person) {
        println("Name: $name, Age: $age")
        "$name, $age"
    }
    println("Name: ${person.name}, Age: ${person2.age}")
    println(result)
}