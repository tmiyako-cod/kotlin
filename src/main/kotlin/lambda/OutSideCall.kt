package org.example.lambda

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

fun myLambdaFunction(echo: String, action: () -> Unit) {
    println(echo)
    action()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val result = list.customFilter({ it % 2 == 0})
    println(result)

    val result2 = list.customFilter { it % 2 != 0 }
    println(result2)

    myLambdaFunction("Hello") {
        println("World")
    }
}

