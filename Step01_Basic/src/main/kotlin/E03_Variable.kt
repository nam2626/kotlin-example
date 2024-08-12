fun main() {
    /*
    *   변수 : 값을 저장하는 공간
    *
    *   변수 선언 방법
    *   var 변수명 : 자료형 = 값
    *   var 변수명 = 값
    *
    *   var 변수명 : 자료형
    *   변수명 = 값
    *
    *   자료형
    *       - 정수형 : Byte, Short, Int, Long
    *       - 실수형 : Float, Double
    *       - 문자형 : Char
    *       - 논리형 : Boolean
    *       - 문자열 : String
    *
    *   변수명 작성 규칙
    *       - 숫자로 시작할 수 없다.
    *       - 특수문자는 _만 사용 가능하다.
    *       - 변수명은 의미를 부여하여 작성하는 것이 좋다.
    *       - 변수명은 대소문자를 구분한다.
    *       - 변수명은 예약어를 사용할 수 없다.
    *       - 변수명은 공백을 포함할 수 없다.
    *       - 변수명은 숫자를 포함할 수 있다.
    *       - 변수명은 camelCase(카멜 표기법)로 작성하는 것이 좋다.
    *
    *   var과 val의 차이
    *         var : 변수 선언 시 사용하는 키워드, 값을 변경할 수 있다.
    *         val : 변수 선언 시 사용하는 키워드, 값을 변경할 수 없다.
    * */

    // 정수형 변수 선언
    var number1 : Byte = 127
    var number2 : Short = 32767
    var number3 : Int = 2147483647
    var number4 : Long = 9223372036854775807

    println(" " + number1 + " " + number2 + " " + number3 + " " + number4)

    // 실수형 변수 선언
    var number5 : Float = 3.14f
    var number6 : Double = 3.14

    println(" " + number5 + " " + number6)

    // 문자형 변수 선언
    var char1 : Char = 'A'
    var char2 : Char = 'B'
    var int1 : Int = 65
    var int2 : Int = 66

    println(" " + char1 + " " + char2 + " " + int1 + " " + int2)
    println(int1.toChar() + " " + int2.toChar())

    // 논리형 변수 선언
    var bool1 : Boolean = true
    var bool2 : Boolean = false

    println(" " + bool1 + " " + bool2)

    // 문자열 변수 선언
    var string1 : String = "Hello"
    var string2 : String = "World"

    println(string1 + " " + string2)

    // 변수명 작성 규칙
    var _number : Int = 10
    //$는 허용 안됨
//    var $number : Int = 20
    var number : Int = 30
    var Number : Int = 40
    var number7 : Int = 50
    var number8 : Int = 60
    //첫글자 숫자로 시작함
//    var 9number : Int = 77

    //상수 선언
    val number9 : Int = 100
    //상수는 값을 변경할 수 없다.
//    number9 = 200
    println(number9)
}