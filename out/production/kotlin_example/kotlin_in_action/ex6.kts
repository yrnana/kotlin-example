package kotlin_in_action

open class User(val nickname: String, val isSubscribed: Boolean = true) // 주생성자

class TwitterUser(nickname: String) : User(nickname)

open class People
class Programmer : People() // 인자가 없는 디폴트 생성자를 상속하므로 () 붙여야

val user = User("혜영", isSubscribed = false)
println("${user.javaClass} ${user.nickname}: ${user.isSubscribed}")

val twitterUser = TwitterUser("예지")
println("${twitterUser.javaClass} ${twitterUser.nickname}: ${twitterUser.isSubscribed}")