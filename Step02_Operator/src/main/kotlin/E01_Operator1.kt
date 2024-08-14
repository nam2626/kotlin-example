fun main(){
    //사칙 연산자
    //  +, -, *, /, %
    var a = 10
    var b = 3
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    println("---------------")

    var c = 10.0
    var d = 3.0

    println(c + d)
    println(c - d)
    println(c * d)
    println(c / d)
    println(c % d)

    println("---------------")

    //형변환
    //  toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
    var e = 10
    var f = 3
    var result = e / f
    println(result)

    var result2 = e.toDouble() / f.toDouble()
    println(result2)

    var result3 = e / f.toDouble()
    println(result3)

    var result4 = e.toDouble() / f
    println(result4)


}