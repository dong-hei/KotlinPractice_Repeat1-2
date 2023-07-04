fun main(args: Array<String>){
    println(MyFirstObject.num)
    MyFirstObject.sayHello()

    println(Dinner.MENU)
    Dinner.eatDinner()
}

//싱글톤 패턴, 클래스의 인스턴스가 오직 하나만 생성됨
//메모리를 절약할수 있다.
//값을 이곳저곳에서 동시에 부를때는 순서의 문제가 있기때문에 항상 구현해야한다.

object MyFirstObject{
    val num = 1
    fun sayHello(){
        println("Hello!")
    }
}

//companion object는 클래스 안에 들어있는 object이고
// 클래스 한개에 한개씩만 사용할수 있다.
class Dinner {
    val lunch = "steak"
    companion object{
        val MENU = "pasta"
        fun eatDinner(){
            println("Today's menu is $MENU")
        }
    }
}