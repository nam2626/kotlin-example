fun main() {
    /*
    *       For 문
    *           - 반복 횟수가 정해져 있을 때 사용
    *           - 배열, 컬렉션 등을 순회할 때 사용
    *           - for(요소 in 컬렉션) { 실행문 }
    *           - for(인덱스 in 시작값..끝값) { 실행문 }
    *           - for(인덱스 in 시작값 until 끝값) { 실행문 }
    *           - for(인덱스 in 시작값..끝값 step 증가값) { 실행문 }
    *           - for(인덱스 in 시작값 downTo 끝값) { 실행문 }
    *           - for(인덱스 in 시작값 downTo 끝값 step 감소값) { 실행문 }
    *           - for(인덱스 in 배열.indices) { 실행문 }
    *           - for((인덱스, 요소) in 배열.withIndex()) { 실행문 }
    * */

    //1~10까지 출력
    for(i in 1..10) {
        print("$i ")
    }

    for(i in 11 until 20 step 2) {
        print("$i ")
    }

    println()

    //1~10까지 출력(2씩 증가)
    for(i in 1..10 step 2) {
        print("$i ")
    }

    println()

    //10~1까지 출력
    for(i in 10 downTo 1) {
        print("$i ")
    }

    println()

    //10~1까지 출력(2씩 감소)
    for(i in 10 downTo 1 step 2) {
        print("$i ")
    }

    println()

    //배열 순회
    val arr = arrayOf(1, 2, 3, 4, 5)

    for(i in arr.indices) {
        print("${arr[i]} ")
    }

    println()

    //배열 순회(인덱스와 요소 함께 출력)
    for((index, value) in arr.withIndex()) {
        println("arr[$index] = $value")
    }

    //배열 순회
    val arr2 = arrayOf(1, 2, 3, 4, 5)
    for(i in arr2) {
        print("$i ")
    }


}