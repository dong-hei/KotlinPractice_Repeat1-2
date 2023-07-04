fun main(args : Array<String>){
    val memo = Memo("하이욤","처음 뵙겠습니다",true)
    println(memo.toString())
    println(memo.Title)
    val memo2 = memo.copy("방가방가")
    println(memo2.toString())
//    선언한것만 변환되고 나머지 값들은ㅇ 복사된다.

}

// data class 로 명시한다.
data class Memo(val Title : String, val Content : String, var isDone : Boolean){

}