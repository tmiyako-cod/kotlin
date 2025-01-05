package org.example.scope

val run_person = Person("Miyakon", 28)

fun main() {
    val result = run_person.run {
        println("Name: $name, Age: $age")
        "$name, $age"
    }
    println(result)

    val result2 = run {
        println("Name: ${run_person.name}, Age: ${run_person.age}")
        "${run_person.name}, ${run_person.age}"
    }

    println(result2)
}