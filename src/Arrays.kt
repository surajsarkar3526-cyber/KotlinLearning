fun main(){
    val arr1 = arrayOf<Int>(1,2,3,4,5)
    val arr2 = arrayOf<String>("CS","IT","Physics","Chemistry")
    //println(arr1.joinToString())

//    for((i, e) in arr2.withIndex()){
//        print("$i $e   ")
//    }
    //arr2[2] = "Math"
//    arr2.set(3, "Biology")
//
//    println("arr2[2] :  ${arr2[2]}")
//    println(arr2.get(3))
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
}