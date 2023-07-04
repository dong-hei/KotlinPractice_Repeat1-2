fun main(args: Array<String>){
    val price = 1000
    val tax = 100

    val ogPrice = "The og price is $price"
    val taxPrice = "Included Tax price is ${price+tax}"

    println(ogPrice)
    println(taxPrice)
    println("-------------------------------------------")

    regionInfo2("Goyang",1077963,2)
    regionInfo2("Ulsan",1166000,52)
    regionInfo2("Incheon",2923000,2)
}

fun regionInfo2(regionName : String,population: Int,localNum: Short) : Unit{
    println("$regionName population is $population")
    println("localNumber is $localNum")
    println("-------------------------------------------")
}