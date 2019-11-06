package getting_started.basic_syntax

// 함수 선언 1
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// 함수 선언 2
fun sum2(a: Int, b: Int): Int = a + b

// 함수 선언 3
fun sum3(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    println("Ctrl + Shift + F10")
    println("sum of 3 and 5 is ${sum1(3, 5)}")
    sum3(3, 5)
}