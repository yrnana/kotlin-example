package kotlin_in_action

//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr
//
//fun eval(e: Expr): Int = when (e) {
//    is Num -> e.value
//    is Sum -> eval(e.right) + eval(e.left)
//    else -> throw IllegalArgumentException("Unknown")
//}

// 봉인된 클래스는 클래스 외부에 자신을 상속한 클래스를 둘 수 없다
sealed class Expr { // private 생성자를 가지고 내부에서만 호출할 수 있다
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

// 무조건 Num or Sum 이므로 else 구문이 필요 없음
fun eval(e: Expr): Int = when (e) {
    is Expr.Num -> e.value
    is Expr.Sum -> eval(e.right) + eval(e.left)
}

fun main() {
    println(eval(Expr.Sum(Expr.Num(5), Expr.Sum(Expr.Num(4), Expr.Num(6)))))
}