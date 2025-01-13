package org.example.`interface`

interface MyInterface {
    fun bar()
    fun foo() {
       println("foo")
    }

    val property: String
    val getProperty: String

    data class MyDataClass(val name: String)
    data class MyDataClass2(val name: String)

    // レシーバに関わるラップをしてくれているし、渡せる処理もレシーバに関わるべき
    fun processWithAfterPrint(
        callback: MyDataClass2.() -> Unit
    ): String {
        callback(MyDataClass2("call MyDataClass2 data"))
        println("processed")
        return "processWithAfterPrint"
    }
}

fun main() {
    val myInterface = InterfaceImpl()
    myInterface.bar()
    myInterface.foo()
    println(myInterface.property)
    println(myInterface.getProperty)

    // IFでのデータクラスをそのまま使用
    val myDataClass = MyInterface.MyDataClass("name")
    println(myDataClass)

    // インターフェースのメソッドを使用
    println(myInterface.createData())

    myInterface.processWithAfterPrint { println("callback: $name") }
}