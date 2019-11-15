package kotlin_in_action

data class Client(val name: String, val postalCode: Int)

val c1 = Client("Lona", 10000)
val c2 = c1.copy(name = "Suzy")
val c3 = c1.copy()
println(c1)
println(c2)
println(c1 == c3)