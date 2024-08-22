fun main() {
    /*
        숫자 두개를 입력 받아서 두 숫자 사이의 합을 출력하는 프로그램을 작성하시오.
    */
    print("숫자 두개를 입력하세요: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var sum = 0

    if (num1 > num2) {
        val temp = num1
        num1 = num2
        num2 = temp
    }

    for(i in num1..num2) {
        sum += i
    }

    println("$num1 ~ $num2 까지의 합: $sum")


}