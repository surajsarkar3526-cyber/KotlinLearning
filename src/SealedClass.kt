fun main(){
    var result = Result.Loading()
    println(result)
    var success = Success()
    var failer = Failer()
    println(success)
    println(failer)
}
fun stateChecks(state:Result){
    when(state){
        is Success -> TODO()
        is Result.Loading -> TODO()
        is Failer -> TODO()
    }
}
sealed class Result{
    class Loading: Result(){

    }
}
class Success: Result(){}
class Failer: Result(){}