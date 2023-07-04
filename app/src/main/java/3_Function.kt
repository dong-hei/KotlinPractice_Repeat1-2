fun main(args : Array<String>){
regionInfo("Deagu",2465000,53)
regionInfo("Seoul",9776000,2)
regionInfo("Incheon",2923000,2)

    println(calERA(2,8.0))
}

fun regionInfo(regionName : String,population: Int,localNum: Short) : Unit{
    println(regionName + " population is " + population)
    println("localNumber is " + localNum)
    println("-------------------------------------------")
}
//Unit은 생략 가능

fun calERA(ERA : Int, INN  : Double) : Double {
    return (ERA*9)/INN
}