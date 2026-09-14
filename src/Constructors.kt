fun main(){
    var animal = Animal("Cow", 5, "Jersey", "Black")

}
class Animal(var name: String, var age: Int, var breed: String, var colour: String) {
    init{
        println("Name of Animal is $name")
    }
    init{
        println("Breed of Animal is $breed")
    }
}




//class Animal(name:String, age:Int, breed:String, colour:String) {
//    var name:String = name;
//    var age:Int = age;
//    var breed:String = breed;
//    var colour:String = colour;
//}