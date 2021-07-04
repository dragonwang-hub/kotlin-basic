fun main() {
    var parent = Parent("DAD")
    parent.printInfo()

    var child = Child("SON", 5)
    child.printInfo()

    var secondChild = SecondChild("SEC",10)
    secondChild.printInfo()

    var thirdChild = ThirdChild(10)
    thirdChild.printInfo()

    var parentDefaultName = Parent();
    parentDefaultName.printInfo();

    var childDefault = Child();
    childDefault.printInfo();
}

// 给予属性默认值，则可使用无参构造器
//open class Parent(val name: String) {
open class Parent(val name: String="BAB") {

    open fun printInfo() {
        print("I am Parent. My name is:$name\n")
    }
}

class Child(name: String, val age: Int) : Parent(name) {
    override fun printInfo() {
        print("I am Child. My name is:$name I am$age\n")
    }
    // 声明无参构造器
    constructor():this("default",18)
}

class SecondChild : Parent {
    private var age: Int = 0

    // 次构造函数
    constructor(name: String, age: Int) : super(name) {
        this.age = age
    }
}

//class ThirdChild(name: String) : Parent(name) {  //Kotlin: Primary constructor call expected
class ThirdChild : Parent{
    private var age: Int = 0

    // 次构造函数
    constructor(name: String, age: Int) : super(name) {
        this.age = age
    }

    constructor(age: Int)  {
        this.age = age
    }


    override open fun printInfo() {
        print("I am ThirdChild. My age is:$age. My name is: $name\n")
    }
}