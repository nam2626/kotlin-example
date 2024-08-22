fun main() {
    //if else if 문
    //if (조건식) { 실행문 } else if (조건식) { 실행문 } else { 실행문 }
    //조건식이 True 일때는 if {} 영역 실행, False 일때는 else if {} 영역 실행
    //else if {} 영역이 False 일때는 else {} 영역 실행

    var a = 10

    if (a > 5) {
        println("a는 5보다 큽니다.")
    } else if (a == 5) {
        println("a는 5입니다.")
    } else {
        println("a는 5보다 작습니다.")
    }
}