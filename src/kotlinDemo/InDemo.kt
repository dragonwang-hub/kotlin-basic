package kotlinDemo

fun main() {
    InDemo.downToTest()
    InDemo.stepTest()
}

object InDemo {
    fun downToTest() {
        for (i in 10 downTo 1 step 2) {
            println(i)
        }
    }

    fun stepTest() {
        for (i in 1..11 step 2) {
            println(i)
        }
    }
}