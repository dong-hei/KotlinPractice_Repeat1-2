fun main(args: Array<String>){
//    속성 (필드 값)
//    Car{color,manufacturer}
//    동작{move(),break()} (메소드)

    val car = Car("Black","ModelY","Tesla",2020)
    val car2 = Car("Pink","M3","BMW",2018)
    println("----------------▲init으로 생성된 객체입니다.-------------------")

    val car3 = Car("red","K5",)
    val car4 = Car("Gray","Grandeur")

    println("Car color is ${car.color}")
    println("Car color is ${car2.color}")
    println("----------------▲객체를 생성하고 인스턴스화-------------------")

}
//파라미터 안에 있는 color를 주 생성자라고 한다.
//init을 사용하면 객체가 생성되는시점에 무엇을 할지 정의한다.
//주 생성자를 보조할수 있는 보조생성자를 constructor(생성자) 라고 한다.

class Car(val color : String,val name : String, val manufacturer : String, val productionYear : Int){
    init{
        println("Color: $color, Name : $name, Manufacture : $manufacturer, productionYear : $productionYear")
    }

    constructor(color : String, name : String) : this(color, name, "Hyundai&Kia", 2022){
        println("-----------▲생성자로 실행된 객체 입니다.-----------")
    }
}