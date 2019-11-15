package kotlin_in_action

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

// 코틀린의 가시성 변경자는 기본적으로 default가 아닌 public
// 패키지 전용 가시성 default => internal

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() { // internal 때문에 TalkativeButton 참조 불가
//    yell() // private라 안됨
//    whisper() // protected라 안됨
//}

//internal fun TalkativeButton.giveSpeech() {
////    yell()
//}