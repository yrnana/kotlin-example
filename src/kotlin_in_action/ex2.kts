package kotlin_in_action

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

// 코틀린 class는 기본적으로 final : 상속 불가능
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked.")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

open class RichButton : Clickable { // 이 클래스는 열려있으므로 상속 가능
    fun disable() {} // 이 함수는 파이널이므로 오버라이드 불가능 : 기본적으로 final
    open fun animate() {} // 이 함수는 열려있으므로 오버라이드 가능
    final override fun click() {} // 이 함수는 상위 메서드를 오버라이드. override 붙으면 기본적으로 열려있음
}

abstract class Animated {
    abstract fun animate()
    fun stopAnimating() {
        // 기본적으로 final
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}