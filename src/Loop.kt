fun main(args : Array<String>){
    println("Hello World!")

    var num = 0
//    for(i in 0 until 10){
//        println("Number is ${num++}")
//    }

    val arrNo = ArrayList<Int>()
    arrNo.add(1)
    arrNo.add(2)
    arrNo.add(3)
    arrNo.add(4)
    arrNo.add(5)
    arrNo.add(6)
    arrNo.add(7)

    for(i in arrNo){
        println(i)
    }
//    for(i in 10 downTo 0 step 3){
//        println("Number is ${num++}")
//    }
}