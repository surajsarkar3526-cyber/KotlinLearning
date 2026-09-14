fun main() {
    var s:String = "CS"
    var str:String? = null
    println(s.isPalindrome())
    if (str != null) {
//        println(str.isPalindrome())
    }
    println(str?.isPalindrome())

    var len = str?.length?: 0
    println("Length:$len")
}