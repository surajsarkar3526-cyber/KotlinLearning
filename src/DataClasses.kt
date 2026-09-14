fun main(){
    var stud1 = Student("CSTechTuber", 8, 14)
    var stud2 = Student("ITTechTuber", 8, 14)
    val(studentName, studentGrade, studentAge) = stud2
    println(studentName)
    println(studentGrade)
    println(studentAge)
//    println(stud1 == stud2)
//    println(stud1.equals(stud2))
//    val stud3 = stud2.copy(name = "Raj")
//    println(stud3)
//    println(stud3.component3())
//    println(stud3.component2())
//    println(stud3.component1())
}
data class Student(var name: String, var grade: Int, var age: Int)