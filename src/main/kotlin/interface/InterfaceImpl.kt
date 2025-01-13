package org.example.`interface`

class InterfaceImpl: MyInterface {
    override fun bar() {
        println("bar")
    }

    // 初期化時に固定された値を持つプロパティ
    // 変更できない
    override val property = "property"

    // getPropertyは値を保持しない
    // プロパティにアクセスするたびにカスタムゲッターが呼び出され、計算された値が返される
    // プロパティ値を動的に生成したい場合に便利
    override val getProperty: String
        get() = "getProperty"

    fun createData(): MyInterface.MyDataClass {
        val myDataClass = MyInterface.MyDataClass("Miyakon")
        return myDataClass
    }

}