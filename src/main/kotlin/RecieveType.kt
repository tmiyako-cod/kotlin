package org.example

// ラムダ式のレシーバー型
val greet: String.() -> String = { "Hello, $this!" }

// 拡張関数のレシーバー型
fun String.greet2(): String {
    return "Hi! $this"
}

fun main() {
    val result = "World".greet()
    println(result)
    val result2 = "Miyakon".greet2()
    println(result2)
}