fun main(args: Array<String>){
    //lambda Expression
    // Value처럼 다룰수 있는 익명함수
    val sayHello = fun() { println("Hello!") } // 위 함수처럼 이름이 없는 익명함수
    sayHello()

    val squareNum : (Int) -> (Int) = {num -> num * num}
    println(squareNum(10))
    //val 람다함수의 이름 지정 : (중괄호안에 어떤 타입을 넣을지) -> (중괄호안에 반환하는 타입) = {
// 입력받는값 -> 입력받은 값을 계산하는 로직}

    val squareNum2= {num : Int -> num * num}
//    (Int) -> (Int)는 생략 가능 , 그러나 중괄호 안에 반환타입은 타입 지정을 해야한다.

    val squareNum3 : (Int) -> (Int) =  {it * it}
//    입력받는값을 it 으로 대체한다

    fun invokeLambda(lambda : (Int) -> Boolean) : Boolean{
        return lambda(11)
    }
    val trueValue = invokeLambda ({num -> num > 4})

    val falseValue = invokeLambda( { num -> num in 3..10 })
    //  lambda값에 무엇을 대입하느냐에 따라 true or false가 된다

    invokeLambda({it in 3..10})
    invokeLambda(){it in 3..10}
    invokeLambda{it in 3..10}
// 이런식으로 축약가능하다

    println(squareNum(30))
    println(squareNum2(35))
    println(squareNum3(35))
    println("-----------------------------------------------")

    println(trueValue)
    println(falseValue)
    println("------------Boolean---------------------")




}