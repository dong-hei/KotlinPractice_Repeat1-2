fun main(args: Array<String>){

    val Naver = Naver()

    Naver.openInternetSite()
    Naver.printInternetSiteName()
}
abstract class Internet {
    fun openInternetSite(){
        println("openInternetSite")
    }

    abstract fun printInternetSiteName()
}

//추상클래스 같은경우는 override를 반드시 받아야 한다 , : 추상클래스() 로 상속받음을 명시한다.
//대규모 프로젝트에서 필히 구현해줘야 하는 사항이 있을떄 추상클래스를 사용한다.
class Naver : Internet() {
    override fun printInternetSiteName() {
        println("This is Naver WebSite")
    }
}