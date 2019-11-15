package kotlin_in_action

//class User {
//    val nickname: String
//    constructor(email: String) {
//        nickname = email.substringBefore('@')
//    }
//    constructor(facebookAccountId: Int) {
//        nickname = "${facebookAccountId}_id"
//    }
//}

// 동반객체
class User private constructor(val nickname: String) { // 주 생성자를 비공개로 만듬
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User("${accountId}_id")
    }
}

val subscribingUser = User.newSubscribingUser("bob@gmail.com")
val facebookUser = User.newFacebookUser(300)
println(subscribingUser.nickname)
println(facebookUser.nickname)

// 동반객체 명명
class Person(val name: String) {
    companion object Loader { // 동반 객체에 이름 붙이기
        fun fromJSON(jsonText: String): Person = Person("Hello")
    }
}

val person = Person.Loader.fromJSON("{ name: 'Dmitry' }")
println(person.name)

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person2(val name: String) {
    companion object : JSONFactory<Person2> {
        override fun fromJSON(jsonText: String): Person2 = Person2("Hello2")
    }
}

// 동반객체 확장함수
class Person3(val firstName: String, val lastName: String) {
    companion object {
        // 비어있는 동반객체 선언
    }
}

fun Person3.Companion.fromJSON(json: String): Person3 = Person3("Lily", "Evans")
val p = Person3.fromJSON("HEY")