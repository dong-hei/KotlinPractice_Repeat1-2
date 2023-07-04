fun main(args: Array<String>){

    val name = "Kim"

    // lateinit -> var 나중에 할당을 해줘도 된다.
    //주의사항 var(변수) 앞에서만 사용할수있다
    //nullable과 함께 사용할수 없다.
    //당연히 변수를 사용하기전에 항상 초기화를 시켜줘야한다.
    //원시자료형(Int,Double,Float,Boolean)이 아닌것만 사용해야한다 (String,Array,Class)
    lateinit var lunch : String
    lunch = "salad"
    println(lunch)
    println("lateinit ------------------------")
    // lazy -> val 처음 실행할때만 실행해주고 다음번부터는 실행하지 않는다
    val lazyBear : String by lazy {
        println("곰이 출몰했다!!")
        "bear"
    }

    println("1 : ")
    println(lazyBear)
    println("2 : ")
    println(lazyBear)
    println("lazy ------------------------")


}