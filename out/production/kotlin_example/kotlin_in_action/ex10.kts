package kotlin_in_action

// 비공개 세터가 있는 프로퍼티 선언하기
class LengthCounter {
    var counter: Int = 0
        private set // 이 클래스 밖에서 이 프로퍼티의 값을 바꿀 수 없다

    fun addWord(word: String) {
        counter += word.length
    }
}

val lengthCounter = LengthCounter()
lengthCounter.addWord("Hi!")
println(lengthCounter.counter)
//lengthCounter.counter += 2