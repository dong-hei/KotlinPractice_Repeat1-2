fun main(args: Array<String>){
//    Collection의 종류1 Mutable : 읽기,삽입,수정 가능
//    mutable List : 읽기 전용 리스트
    val mFruitList = mutableListOf("Banana","Apple","Cherry","Watermelon")
    println("First fruits is ${mFruitList[0]}")
    println("-----------------------Mutable List----------------------------")
    mFruitList[0] = "Strawberry"
    println("New First fruits is ${mFruitList[0]}")
    println("-----------------Modified Mutable List----------------------")

//    forEach : 리스트에 있는 값을 한개씩 꺼내서 루프돌리겠다
    mFruitList.forEach {fruit -> println("My Fruits List : $fruit")}
    println("-----------------Loop Mutable List----------------------")

//   mutable Set : 순서 없음, 중복 안됨
    val mNumSet = mutableSetOf<Int>(1,1,2,3,4,4,5,8,11,18)
    mNumSet.add(100)
    mNumSet.remove(1)
    println(mNumSet)
    println(mNumSet.contains(3))
    println("-----------------------Mutable Set----------------------------")

//    mutable Map : 키를 가지고 있으면 값에 접근 할수있다.
    val mCorMap = mutableMapOf("copName" to "SamsungElectronics", "country" to "Korea", "foundationYear" to 1969)
    println(mCorMap["copName"])
    mCorMap["country"] = "USA"
    mCorMap.put("hqLocation","Suwon")
    mCorMap.remove("foundationYear")
    mCorMap.replace("copName","Samsung")
    println(mCorMap)
    println("-----------------------Mutable Map----------------------------")

//    Collection의 종류2 Immutable : 읽기 전용
//    Immutable List : 읽기 전용 리스트
    val fruitList = listOf("Banana","Apple","Cherry","Watermelon")
    println("First fruits is ${fruitList[0]}")
    println("-----------------------Immutable List----------------------------")

//    fruitList[0] = "Strawberry" 읽기 전용 리스트 이기 때문에 수정할 수 없다

// Immutable Set : 순서 없음, 중복 안됨
    val NumSet = setOf(1,3,4,3,3,2,1,5,8,8)
    println(NumSet)
    println("-----------------------Immutable Set----------------------------")

//    Immutable Map : 키를 가지고 있으면 값에 접근 할수있다.
    val copMap = mapOf("copName" to "SamsungElectronics", "Country" to "Korea", "foundationYear" to 1969)
    println(copMap["copName"])
    println(copMap["num"])
    println("-----------------------Immutable Map----------------------------")


}