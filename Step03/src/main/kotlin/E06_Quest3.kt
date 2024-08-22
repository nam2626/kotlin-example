fun main() {
    /*
        문제
            점수 0~100인 값을 하나 입력 받아서
            아래 데이터 범위를 보고 해당 성적 등급을 출력하세요
            90~100: A
            80~89: B
            70~79: C
            60~69: D
            0~59: F
     */

    print("점수를 입력하세요: ")
    val score = readln().toInt()
/*
    if(score >= 90){
        println("A")
    } else if(score >= 80){
        println("B")
    } else if(score >= 70){
        println("C")
    } else if(score >= 60){
        println("D")
    } else {
        println("F")
    }
*/
    if (score in 90..100) {
        println("A")
    } else if (score in 80..89) {
        println("B")
    } else if (score in 70..79) {
        println("C")
    } else if (score in 60..69) {
        println("D")
    } else {
        println("F")
    }
}