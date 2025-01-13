package org.example.project_reactor.mono

import reactor.core.publisher.Mono

fun main() {
    // 1つの値を返す非同期処理
    val mono = Mono.just("Hello, World!")
    mono.subscribe { println(it) }

    // 値がないMono
    val emptyMono = Mono.empty<String>()
    emptyMono.subscribe(
        { value -> println(value) },            // onNext
        { error -> println("Error: $error") },  // onError
        { println("Completed with no data.") }  // onComplete
    )

    // エラーを返すMono
    val errorMono = Mono.error<String>(RuntimeException("Error!"))
    errorMono.subscribe(
        { value -> println(value) },
        { error -> println("Error: $error") },
        { println("Completed with no data.") }
    )

    // 非同期処理
    val asyncMono = Mono.fromCallable {
        Thread.sleep(1000) //長い処理
        "Async Result"
    }
    asyncMono.subscribe { value -> println(value)}

    val testMono = Mono.just("test init!")
    testMono.subscribe(
        { value -> println(value) },
        { error -> println("Error: $error") },
        { println("change!") }
    )

    // testMonoの値を変換
    testMono.map { it.uppercase() }
        .subscribe { value -> println(value) }
}
