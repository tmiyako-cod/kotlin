package org.example.project_reactor.flux

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

fun main() {
    val flux = Flux.just("Hello", "World")
    flux.subscribe(
        { item -> println(item) },
        { error -> println("Error: $error") },
        { println("Completed.") }
    )

    val emptyFlux = Flux.empty<String>()
    emptyFlux.subscribe(
        { item -> println(item) },
        { error -> println("Error: $error") },
        { println("Empty Completed.") }
    )

    val errorFlux = Flux.error<String>(RuntimeException("Error!"))
    errorFlux.subscribe(
        { item -> println(item) },
        { error -> println("Error: $error") },
        { println("Error Completed.") }
    )

    Flux.range(1, 5)
        .filter { it % 2 == 0 }
        .map { it * 10 }
        .subscribe { println(it) }

    Flux.interval(Duration.ofMillis(500)) // 500ms間隔で値を発行
        .take(5) // 5つの値を発行したら終了
        .subscribe { println(it) }

    println("start sleep")
    Thread.sleep(3000)
    println("sleep finish") // メインスレッドを3秒間停止
}