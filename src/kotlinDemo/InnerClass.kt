package kotlinDemo

class Outer {
    private val bar: Int = 1
    var v = "成员属性"
    /**嵌套内部类**/
    /**非静态内部类，可以引用内部类外部的成员**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }

    /**嵌套内部类**/
    /**静态内部类，不可以引用内部类外部的成员**/
    /**静态内部类，此类不是单例模式**/
    class StaticInner {
        var staticInnerInt = 1
        fun StaticInnerTest() {
            println("这是一个测试，测试是否为单例 $staticInnerInt \n")
        }
    }
}

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
    println(demo) //   1
    val demo2 = Outer().Inner().innerTest()
    println(demo2)   // 内部类可以引用外部类的成员，例如：成员属性

    val staticInner = Outer.StaticInner()
    staticInner.staticInnerInt = 2
    staticInner.StaticInnerTest()
    val otherStaticInner = Outer.StaticInner()
    otherStaticInner.StaticInnerTest()
}

