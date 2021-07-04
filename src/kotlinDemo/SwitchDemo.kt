package kotlinDemo

fun main() {
    SwitchDemo.switchTest(10)
    SwitchDemo.whenTest()
    SwitchDemo.ifElseTest(1)
}

object SwitchDemo {
    fun switchTest(param: Int) {
        val grade = when (param) {
            9, 10 -> "Excellent"
            in 6..8 -> "Good"
            4, 5 -> "Ok"
            in 1..3 -> "Fail"
            else -> "Fail"
        }
        println("Grade is: $grade")
    }

    fun whenTest() {
        val x = 6
        val s = "hello"
        val res = when {
            x in 1..10 -> "cheap"
            s.contains("hello") -> "it's a welcome!"
            else -> ""
        }
        println("Result is: $res")
    }

    fun ifElseTest(count: Int) {
        val result = if (count > 0) 10 else 0
        println("Result is: $result")
    }
}