fun main(args: Array<String>){
    //1. If
    val examResult = isPass(55)
    println("ExamResult: $examResult")
    println("-------------------If----------------------")

    val is3Contained = is3Contained(4..10)
    println("is3Conntained Result : ${is3Contained}")
    println("-------------------If----------------------")

    //2. when 값을 분기해서 확인한다
    val myGrade = getGrade(85)
    println("My Grade : ${myGrade}")
    println("-------------------When----------------------")

}

fun isPass(examScore: Int) : Boolean {
    if(examScore >= 60){
        return  true
    }
    else{
        return false
    }
}

fun is3Contained(intRange : IntRange) : Boolean {
    if(intRange.contains(3)){
        return true
    }
    else{
        return false
    }
}

fun getGrade(score: Int) : Any {
    when(score){
        in 0 .. 40 -> return  "0"
        in 41 .. 70 -> return "C"
        in 71..80 -> return 'B'
        in 80..90 -> return "B+"
        in 90..100 -> return 'A'
        else -> return "No Score"
    }
}