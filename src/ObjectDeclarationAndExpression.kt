fun nain(){
//    println(ABC.name)
    var obj = object:Type{
        val name = "ABC"
        fun getName(){
            println("Name is ABC")
        }

        override fun type(){
            println("This is anonymous Object")
        }
    }
    println(obj.name)
    obj.type()
}
object ABC{
    val name = "ABC"
    fun getName(){
        println("Name is ABC")
    }
}
//open class X{
//
//}
interface Type{
    fun type(){

    }
}