fun main(){
    val person1 = Person("Raj", 19, "Male", "Actor")
    val person2 = Person("Shalini", 30, "Female", "Software Engineer")
    println(person1 == person2)
    println("Name of Person1 is : ${person1.name}")
    person1.work()
    person1.getAge()
    person1.getGender()
    println("Name of person2 is : ${person2.name}")
    person2.work()
    person2.getAge()
    person2.getGender()
}
class Person(var name: String, var age: Int, var gender: String, var occupation: String){
    fun work(){
        println("$name is $occupation")
    }
    fun getAge(){
        println("Age is $age")
    }
    fun getGender(){
        println("Gender is $gender")
    }
}
//fun main(){
//    val person = Person()
//    println(person.name)
//    println(person.age)
//    person.work()
//    person.gender
//}
//class Person{
//    val name:String = "CS  TechTube"
//    val age:Int = 29
//    val gender:String = "Male"
//    val occupation: String = "Youtuber"
//
//    fun work(){
//        println("$name is $occupation")
//    }
//    fun getAge(){
//        println("Age is $age")
//    }
//
//    fun getGender(){
//        println("Gender is $gender")
//    }
//}