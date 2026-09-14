fun main(){
    var voter = Voter();
    voter.ageToVote = 12
    println(voter.ageToVote)
    println(voter.nameOfVoter)
}
class Voter{
    var ageToVote:Int = 18
        get() = field
        set(value){
            if(value < 10){
                println("Age to Vote cannot be lesser than 18")
            }
            else{
                field = value
            }
        }
    var nameOfVoter:String ="CSTechtube"
        get(){
            return "$field is eligible to vote";
        }
}