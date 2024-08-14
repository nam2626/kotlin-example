fun main() {
    //복합 대입연산자
    //  +=, -=, *=, /=, %=
    var a = 10
    var b = 3

    a += b
    println(a)

    a -= b
    println(a)

    a *= b
    println(a)

    a /= b
    println(a)

    a %= b
    println(a)

    println("---------------")

    //증감 연산자
    //  ++, --
    var c = 10
    c++
    println(c)
    c--
    println(c)

    println("---------------")
    //전위형 후위형
    var d = 10
    var e = 10

    println(d)
    println(++d)
    println(d)

    println(e)
    println(e++)
    println(e)

    println("---------------")

    var f = 10
    var g = 3
    var result = f++ * 3 + ++g * 2 + f

    println(result)


}