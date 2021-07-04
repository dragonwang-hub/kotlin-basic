package kotlinDemo

import java.util.stream.Collectors

fun main() {
    LambdaDemo.test()
}

object LambdaDemo {
    fun test() {
        val listStr = listOf("Alice", "Bob", "Chris", "Dede")
        listStr.forEach { println(it) }
        val listInt = listStr.stream().map {
            val strNew = "$it Name"
            strNew.length
        }.collect(Collectors.toList())
        println(listInt)
    }
}