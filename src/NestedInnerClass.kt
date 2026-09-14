class outerClass{
    var name = "OuterClass"
    inner class InnerClass{
        fun innerFunction(){
            println("Inside inner Class $name")
        }
    }
}

fun main(){
    val inClass = outerClass().InnerClass()
    inClass.innerFunction()
}