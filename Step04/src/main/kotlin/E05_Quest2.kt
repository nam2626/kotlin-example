fun main() {
    /*
    *  숫자를 입력받아 해당 숫자의 팩토리얼을 구하는 프로그램을 작성하시오.
    *
    *  팩토리얼 : 1부터 n까지의 정수를 모두 곱한 것
    * */

    print("숫자를 입력하세요: ")
    var num = readln().toInt()
    var result = 1

    for(i in 1..num) {
        result *= i
    }

    println("$num! = $result")
}