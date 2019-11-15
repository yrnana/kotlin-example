package kotlin_in_action

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}

    class ButtonState : State {} // 자바 static 중첩 클래스
}

class Outer {
    inner class Inner { // 내부 클래스라고 명시해야 바깥쪽 클래스 인스턴스에 접근할 수 있다
        fun getOuterReference(): Outer = this@Outer
    }
}