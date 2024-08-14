fun main() {
    //비트 연산자
    //  and, or, xor, inv, shl, shr, ushr
    //  AND : 두 비트가 모두 1일 때만 1
    //  OR : 두 비트 중 하나라도 1이면 1
    //  XOR : 두 비트가 다르면 1
    //  INV : 비트를 반전
    //  SHL : 왼쪽으로 비트 이동
    //  SHR : 오른쪽으로 비트 이동
    //  USHR : 오른쪽으로 비트 이동(부호비트 무시)

    var a = 10
    var b = 3

    println(a and b)
    println(a or b)
    println(a xor b)
    println(a.inv())
    println(a shl 2)
    println(a shr 2)
    println(a ushr 2)

}