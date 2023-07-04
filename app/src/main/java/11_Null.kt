fun main(args: Array<String>){
    //Nullable vs Non-Nullable(Default)
    var myName : String = "Kim" // Default Non-Nullable
    println(myName.reversed())

    //Nullable ? : null을 가능하게 만들어준다
    var nMyName : String? = null
//    println(nMyName.reversed()) 에러가 뜨는데 null을 넣어서 컴파일 오류가 난게 아니다.
//    String 일 수 도 있는 타입이기 때문에 앞에 있는게 nullable이면 함수를 사용할수 없도록 강제한다.
//    (Null Pointer Exception)을 방어하기 위한 안전한 코딩

    println(nMyName?.reversed())
//    null인 경우에는 null을 반환하게 된다.

    // ?: 앨비스연산자
    // nMyName이 Null 이 아니면.reversed를 하고 Null이면(?:) 이것을 반환해라
    val kim = nMyName?.reversed() ?: "Kim is Ordinary FirstName"
    println("Kim : $kim")

    // !! 확정 연산자
    // 이건 절대 null이 되어선 안될때 사용한다. (확실할때만 사용해야 되기 때문에 남용해서는 안된다.)
    println(nMyName!!.reversed())
}