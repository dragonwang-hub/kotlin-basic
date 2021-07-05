package kotlinDemo

fun main() {
    //构造对象同时属性赋值
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }

    val admin = Person().apply {
        name = "Admin"
        age = 42
        city = "Berlin"
    }

    println(adam)
    println(admin)
}

data class Person(
    var name: String = "",
    var age: Int = 0,
    var city: String = ""
)
