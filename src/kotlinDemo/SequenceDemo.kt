package kotlinDemo

fun main() {
    SequenceDemo.listOrMapOfTest()
    SequenceDemo.mutableListOrMapOfTest()
}

object SequenceDemo {
    fun listOrMapOfTest() {
        val listOfNumber = listOf(1, 2, 3, 4)
        val keyValue = mapOf(
            1 to "Amit",
            2 to "Ali",
            3 to "Mindorks"
        )
        println("list is: $listOfNumber \n")
        println("map is: $keyValue\n")
//        listOfNumber.add(5) //error
//        keyValue.put(4,"Tom") //error
    }

    fun mutableListOrMapOfTest() {
        val listOfNumber = mutableListOf(1, 2, 3, 4)
        val keyValue = mutableMapOf(
            1 to "Amit",
            2 to "Ali",
            3 to "Mindorks"
        )
        listOfNumber.add(5)
        keyValue.put(4,"Tom")

        println("list is: $listOfNumber \n")
        println("map is: $keyValue\n")
    }
}