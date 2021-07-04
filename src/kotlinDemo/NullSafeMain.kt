package kotlinDemo

fun main() {
    NullSafeMain.safeCallTest()
    NullSafeMain.classCastTest()
}

object  NullSafeMain {
    fun safeCallTest(){
        val listWithNulls: List<Int?> = listOf(1,2,3,null)
        for (item in listWithNulls) {
            item?.let{
                val count = it + 1 // it 关键字，替代对象
                print(count)
            }
        }
    }

    fun classCastTest(){
        val str = "adf"
        val math = str as? Int
        println(math?:-1)
    }
}