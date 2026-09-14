fun main(){
    val dir = Directions.East
    println(dir.ordinal)
    for(i in Directions.values()){
        println(i.name)
    }
    dir.printDirectionName()
}
enum class Directions(val num:Int){
    East(1),
    West(2),
    North(3),
    South(4);

    fun printDirectionName() {
        println("direction name is $this")
    }
}