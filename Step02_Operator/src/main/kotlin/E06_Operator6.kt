fun main() {
    //삼항 연산자 : if문을 간단하게 표현
    //  조건식이 참이면 결과1, 거짓이면 결과2
    //  if(조건식) 결과1 else 결과2
    var a = 10
    var b = 3

    var max = if(a > b) a else b
    println(max)

    var min = if(a < b) a else b
    println(min)
}