package kotlinDemo


object OutObject {
    var outParameter = "out"
    fun outFunction(parameter:String) {
        println("Out object function result: $parameter.")
    }
}

fun changeParam(parameter: String){
    OutObject.outParameter = parameter
}

class ObjectOuter {
    object Inner{
        fun method(){
            println("I'm in inner class")
        }
    }
}

fun main() {
    print(OutObject.outParameter)
    OutObject.outFunction("Test object");
    print("==========================\n")
    changeParam("change param")
    print(OutObject.outParameter)

    // test two object inner
    ObjectOuter.Inner.method()
}

