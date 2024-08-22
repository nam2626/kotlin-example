fun main() {
    /*
    *   When
    *       - When은 다른 언어의 switch case 문과 유사한 역할을 한다.
    *       - When은 조건에 따라 다른 실행문을 실행할 수 있다.
    *       - When은 다양한 조건을 사용할 수 있다.
    *
    *       - When 문법
    *          when(조건식) {
    *               조건값1 -> 실행문1
    *               조건값2 -> 실행문2
    *            ...
    *              else -> 실행문
    *
    *           }
    *
    * */
    var a = 10

    when (a) {
        5 -> println("a는 5입니다.")
        10 -> println("a는 10입니다.")
        else -> println("a는 5도 아니고 10도 아닙니다.")
    }

    // When 문법 - 범위 잡는 법
    when (a) {
        in 1..5 -> println("a는 1부터 5까지 입니다.")
        in 6..10 -> println("a는 6부터 10까지 입니다.")
        else -> println("a는 1부터 10까지 아닙니다.")
    }
}