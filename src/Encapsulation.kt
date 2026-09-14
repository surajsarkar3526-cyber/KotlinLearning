fun main(){
    var instance_a:A = A()
}
var a = 8
fun abc(){}
open class A{
    var a = 10
    private var b = 11
    protected fun xyz(){}
}
open class B:A(){
    fun abc(){
        super.xyz()
    }
}