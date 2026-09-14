fun main(args : Array<String>){
    var num = 110
    var mse = if(num > 100) "Number is Greater!" else if(num < 100) "Number is Smaller!" else "Not Smaller and Not Greater!"
//    if(num > 100){
//        println("Number is greater!")
//    }
//    else if(num < 100){
//        println("No. is smaller!")
//    }
//    else{
//        println("No. is neither smaller And Nor greater!")
//    }
    println(mse)

    // --> switch -> when

//    when(num){
//
//        1->{
//
//        }
//        100->{
//
//        }
//    }
    when{

        num > 100 ->{
            println("Number is Greater!")
        }
        num < 100 ->{
            println("Number is Smaller!")
        }
        num == 100 ->{
            println("Number is Greater!")
        }
    }
}