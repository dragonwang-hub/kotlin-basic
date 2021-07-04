package kotlinDemo

class ObjectTest {
    companion object {
        val a = 20
        fun method() {
            println("I'm in companion object")
        }
    }
    val out = 10;
}

fun main(args: Array<String>) {
    ObjectTest.method()
    println(ObjectTest.a)
    val objectTest = ObjectTest()
    println(objectTest.out)
}

