fun main(){
    var derived = DerivedClass();
    println(derived.name)
    //derived.method1()
    derived.method2()
    println(derived.name)
}
open class BaseClass{
    var name = "BaseClass"
    fun method1(){
        println("I am BaseClass")
    }
}
class DerivedClass:BaseClass(){
    var name2 = "DErivedClass"
    fun method2(){
        println("I am $name")
        println("I am derivedClass")
    }
}