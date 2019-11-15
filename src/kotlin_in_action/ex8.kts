package kotlin_in_action

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)
    private fun getFacebookName(id: Int): String {
        return "mem_$id"
    }
}

val fm = FacebookUser(100)
println("accountId: ${fm.accountId}, nickname: ${fm.nickname}")

val sm = SubscribingUser("nyryn0945@gmail.com")
println("nickname: ${sm.nickname}")