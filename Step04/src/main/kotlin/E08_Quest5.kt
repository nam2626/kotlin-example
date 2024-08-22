fun main() {
    /*
    *   숫자 10개를 입력받아서 입력 받은 숫자들 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
    * */

    var max = Int.MIN_VALUE

    for(i in 1..10) {
        print("숫자를 입력해주세요: ")
        val num = readln().toInt()

        if(num > max) {
            max = num
        }
    }

    println("입력 받은 숫자 중 가장 큰 수: $max")
}