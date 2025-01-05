package org.example.scope

fun main() {
    val name: String? = null

    name?.let {
        println(it)
    }

    val result = name?.let {
        it.uppercase()
    }

    println(result)

    val non_null_name: String = "Miyakon"
    non_null_name.let {
        println(it)
    }
}