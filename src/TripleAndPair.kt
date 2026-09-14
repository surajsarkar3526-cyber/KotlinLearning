fun main() {
    println("Hello World!")

//    var (a, b) = Pair("A", 1)
    var name = Pair("Raman", Pair("Ramanujan", Pair("Ramjan", 1)))
    println("$name")

//    println("$a $b")
//    println("${name.first} ${name.second.second.first}")

    val number = Triple("Hello", "world!", Triple(1, 2, 3))
//    println("${x} ${y} ${z}")
    println("$number")
}