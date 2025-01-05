package org.example.Reflection

import kotlin.reflect.full.*

data class User(val name: String, val age: Int)

fun main() {
    val kClass = User::class
    println(kClass.simpleName) // クラス名を取得
    println("Properties: ${kClass.memberProperties}") // プロパティのリフレクション情報を取得
}