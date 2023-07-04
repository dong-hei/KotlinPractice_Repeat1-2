fun main(args: Array<String>){
    val korea = Korea("South Korea","Seoul","Korea")
    korea.singNationalAnthem()
    korea.printFullName()
    korea.printCapital()
    korea.printLang()
    println("korea inform--------------------------------------------------")
    val usa = USA("United States Of America","Washington DC","English")
    usa.singNationalAnthem()
    usa.printFullName()
    usa.printCapital()
    usa.printLang()
    println("usa inform--------------------------------------------------")

}
//코틀린에서 상속은 클래스앞에 반드시 open을 붙이고, 콜론 : 생성자() 방식으로 위임한다
//오버라이딩도 마찬가지로 부모함수에 open을 붙이고,자식 클래스 앞에 override를 붙여아한다.
open class Country(val fullName : String, val capital : String ,val lang : String){
    fun printFullName(){
        println("Full name : $fullName")
    }

    fun printCapital(){
        println("Full capital : $capital")
    }

    fun printLang(){
        println("Full lang : $lang")
    }
    open fun singNationalAnthem(){
        println("Start singing")
    }
}

//상수로 받기때문에 주 생성자에 val을 붙이면 안된다.
class Korea(fullName : String,capital : String ,lang : String) : Country(fullName,capital,lang){
    override fun singNationalAnthem(){
        super.singNationalAnthem()
        //super를 사용하면 부모 클래스의 인스턴스도 실행한다.
        println("Sing Korea national anthem")
    }
}

class USA(fullName : String,capital : String ,lang : String) : Country(fullName,capital,lang){
    override fun singNationalAnthem(){
        super.singNationalAnthem()
        println("Sing USA national anthem")
    }
}