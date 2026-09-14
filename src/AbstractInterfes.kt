fun main(){
//    var rect:Shape = Rectangle()
//    rect.draw()
//    var shape = Rectangle()
//    shape.draw()
    var arr = arrayOf(Rectangle(), Square(), Circle(), Triangle(), Picture())
    for(i in arr){
        //i.draw()
        i.name()
    }
}
abstract class Shape: Name{
    abstract var i: Int
    abstract fun draw()
    fun type(){

    }
}
interface Name {
    fun name()
    fun xyz(){

    }
    var a:Double
    get() = 0.0
    set(value) = TODO()
}
interface xyz{
    fun xyz()
}
class Rectangle:Shape(){
    override var i = 0
    override fun draw(){
        println("Drawing a Rectangle")
    }
    override fun name(){
        println("Name is Rectangular")
    }
}
class Circle: Shape(){
    override var i = 0
    override fun draw(){
        println("Drawing a Circle")
    }
    override fun name(){
        println("Name is Circle")
    }
}
class Square: Shape(){
    override var i = 0
    override fun draw(){
        println("Drawing a Square")
    }
    override fun name(){
        println("Name is Square")
    }
}
class Triangle:Shape(){
    override var i = 0
    override fun draw(){
        println("Drawing a Triangle")
    }
    override fun name(){
        println("Name is Triangle")
    }
}

class Picture: Name{
    override fun name(){
        println("Name is Picture")
    }
}