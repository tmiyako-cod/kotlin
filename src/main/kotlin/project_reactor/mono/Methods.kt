package org.example.project_reactor.mono

import reactor.core.publisher.Mono

fun main(){
    // map 値の変換
    // MonoやFluxのようなイベントではなく1つの値を返すことが前提
    val mapMono = Mono.just("Hello, World!")
        .map { it.uppercase()}
    mapMono.subscribe { println(it) }

    // flatMap 他のMonoを返す
    val flatMapMono = Mono.just("john")
        .flatMap { name -> Mono.just("Hello, $name") }
    flatMapMono.subscribe { println(it) }

    // filter 条件に合致する場合のみ値を返す
    val filterMono = Mono.just("miyakon")
        .filter { it.length >= 9 }
    filterMono.subscribe { println(it) }
    val filterMonoEmpty = Mono.just("miyakon_empty")
        .filter { it.length >= 5 }
    filterMonoEmpty.subscribe(
        { value -> println(value) },
        { error -> println("Error: $error") },
        { println("miyakon_emptyが条件に合わなかったのでデータなし") }
    )

    // switchIfEmpty 条件に合致しない場合に別のMonoを返す
    val switchIfEmptyMono = Mono.just("miyakon_if")
        .filter { it.isEmpty() }
        .switchIfEmpty(Mono.just("miyakon_switchIfEmpty"))
    switchIfEmptyMono.subscribe { println(it) }
}
