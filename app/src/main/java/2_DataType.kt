fun main(args : Array<String>){
    //메모리를 효율적으로 사용하기 위한 것
    //1. Numbers
    // Byte : -128 ~ 127 , Short 명시를 안하면 Int로 추론한다
    var mByte : Byte = 127
    // Short -2^15 ~ 2^15-1 , Short 명시를 안하면 Int로 추론한다
    var mShort : Short = 32767
    // Int -2^31 ~ 2^31-1
    var mInt : Int = 2147483647
    // Long -2^63 ~ 2^63-1
    var mLong : Long = 9223372036854775807L
    // Float 소숫점 5~6자리까지
    var mFloat : Float = 1.111111f
    // Double 소숫점 14~15자리까지
    var mDouble : Double = 9.999999999999998

    // 2. Characters 한글자 (작은 따옴표)
    var mChar : Char = 'a'
    // 3. Strings (큰 따옴표)
    var mString : String = "Hello Android"
    // 4. Booleans 참 or 거짓
    var mFalse : Boolean = false
    var mTrue : Boolean = true
    // 5. Arrays 코틀린에서는 형을 지정하고 arrayOf 함수로 들어간다.
    var mArray : Array<String> = arrayOf("Kotlin","JAVA","C")
    println(mArray[0])
    println(mArray.get(1))
    println(mArray.size)



}