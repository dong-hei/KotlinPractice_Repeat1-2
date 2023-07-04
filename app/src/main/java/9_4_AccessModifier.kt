fun main(args : Array<String>){
    val a = A()
    println("a,b :${a.a}")
    println("a,b :${a.b}")
    println("public Only----------------")
    
    val b = B()
//    println("a,b :${b.c}") private이기 때문에 사용 불가능
    println("a,b :${b.d}")
    println("priavte c and public d------------")
    
    val c = C()
//    println(c.e) protected
//    println(c.f) private
    println(c.g)
    println("protected e and private f and public g------------")

    val d = D()
    d.printCProperties()
    println("D class-------------------------------------------")
}
public class A {
    public val a = 1
    val b = 2
    // 변수나 상수에도 접근 제한자를 붙일수 있다.
    // defult값은 public
}

public class B {
    private val c = 1
    val d = 4
}
open class C {
    protected val e = 5
    private val f = 44
    public val g = 7
}
public class D : C() {
    fun printCProperties(){
        println("e : $e") // 자식클래스에 있기때문에 사용 가능,상속받지 않은 클래스에서는 사용 불가능
//        print("f : $f") private이기 때문에 사용 불가능
        print("g : $g")

    }
}


//접근 제한자
//public : 어디에서나 접근 가능 (기본 접근 제한자)
//internal : 같은 모듈 내에서 접근 가능
//protected : 자식 클래스에서만 접근 가능
//private : 해당 클래스 내부에서만 접근 가능