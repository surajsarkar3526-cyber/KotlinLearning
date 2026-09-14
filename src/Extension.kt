fun main() {
    var circle = Circles()
    println(circle.area(4))
    println(circle.perimeter(7))
    var str = "Madam"
    println(str.isPalindrome())
}
class Circles{
    fun area(r:Int):Double{
        return 3.14*r*r;
    }
}
fun Circles.perimeter(r:Int):Double{
    return 2*r*3.14
}
fun String.isPalindrome(): Boolean {
    return this.lowercase() == this.lowercase().reversed()
}