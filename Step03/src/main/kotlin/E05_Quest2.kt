fun main() {
    /*
        문제
            숫자 두개를 입력 받아서 두 숫자 중 큰 숫자를 출력하는 코드를 작성하시오.
     */
    print("숫자를 입력하세요: ")
    val num1 = readln().toInt()
    print("숫자를 입력하세요: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1")
    } else {
        println("$num2")
    }
}