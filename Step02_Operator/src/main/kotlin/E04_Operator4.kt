fun main() {
    //논리 연산자
    //  &&, ||, !
    //  AND : 두 항이 모두 참일 때만 참
    //  OR : 두 항 중 하나라도 참이면 참
    //  NOT : 항의 논리값을 반대로 바꿈
    var a = true
    var b = false

    println(a && b)
    println(a || b)
    println(!a)
    println(!b)

    println("---------------")

    var c = 10
    var d = 3

    println(c > 3 && d > 3)
    println(c > 3 || d > 3)
    println(!(c > 3))
    println(!(d > 3))

    println("---------------")

    //단락 회로(Short Circuit)
    var e = 10
    var f = 3

    var result = e < 3 && ++f > 3
    println(f)
    result = e > 3 || ++f > 3
    println(f)
}