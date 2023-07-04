fun main(args: Array<String>){
//Range Class 코틀린에는 특정범위의 값을 간편하게 표현할수있는 클래스가 있다
//    IntRange
    val numRange : IntRange = 1..5
    println(numRange.contains(3))
    println(numRange.contains(0))
    println("---------------For-----------------")
//    charRange
    val charRange : CharRange = 'a'..'f'
    println(charRange.contains('g'))
    println(charRange.contains('c'))
    println("---------------For-----------------")

// For문
    for (i in 1..5){
        println(i)
    }
    println("---------------For-----------------")

// For문 1이상 10미만
    for (u in 1 until 10){
        println(u)
    }
    println("---------------For-----------------")

// For문 10,9,8 ... 역순
    for (dt in 10 downTo  1){
        println(dt)
    }
    println("---------------For-----------------")
// For문 step 스텝수만큼 건너띄면서 증가
    for (st in 1..10 step 2){
        println(st)
    }
    println("---------------For-----------------")
//    While문 주어진 조건이 참일때 계속 반복하는 제어문
    var num = 1
    while (num <= 5){
        println("current number : $num")
        num++
    }
    println("---------------While-----------------")

//    do 안의 중괄호를 먼저 실행한다.
    var doNum = 0
    do{
        println("current number : $doNum")
        doNum++
    }while(doNum<5)
    println("---------------do While-----------------")

}
