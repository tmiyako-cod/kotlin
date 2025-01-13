package org.example.project_reactor.mono

import kotlinx.coroutines.reactive.awaitSingle
import kotlinx.coroutines.runBlocking
import reactor.core.publisher.Mono

fun main() = runBlocking {
    // Kotlin Coroutinesとの統合用拡張関数
    // 非同期のMonoやFluxから1つの値を同期的に待機して取得するための拡張関数
    val mono = Mono.just("Hello, World!")
    val result = mono.awaitSingle()
    println(result)
}