package org.example.Refarences

fun printMessage(message: String) {
    println(message)
}

val name = "Kotlin"

class Example

fun main() {
    val print = ::printMessage // 関数参照
    print("Hello, World!")

    val property = ::name // プロパティ参照
    println(property.get())

    val klass = Example::class // クラス参照
    println(klass.simpleName)

}