fun main() {
       /*
       *    숫자 0을 입력할 때까지 숫자를 입력받은 후에
       *    입력 받은 숫자의 평균을 출력하세요
       *
       * */

    var sum = 0
    var count = 0
    var num = 0
    do{
        print("숫자를 입력하세요: ")
        var num = readln().toInt()

        sum += num
        count++
    }while (num != 0)
    count--;
    println("평균: ${sum / count.toDouble()}")
}