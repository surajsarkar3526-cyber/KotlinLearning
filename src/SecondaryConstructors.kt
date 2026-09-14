fun main(){
    var animal1 = Animals("Cow", 5, "Jersey", "Balck")
    val animal2 = Animals(animalName = "Dog", animalColour = "White")

}
class Animals(var name: String, var age: Int, var breed: String, var color: String) {
    constructor(animalName:String, animalColour:String):this(animalName, 1, "Jersey", animalColour)
    init{
        println("Name of Animal is : $name")
    }
    init{
        println("Breed of Animal is : $breed")
    }
    init{
        println("Colour is :  $color")
    }
    init{
        println("Animal Name is :  $name")
    }
}