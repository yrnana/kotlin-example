package kotlin_in_action

fun main() {
    println("Kotlin".length)

    val args: Array<String> = listOf("a", "b", "c").toTypedArray()
    val list = listOf("args", *args)
    println(list)

    val map = mapOf(1 to "one", 7 to ("seven"))
    println(map)
    val (number, name) = 1 to "one"
    println("$number: $name")

    val test = "A.BC-D.E"
    println(test.split("."))
    println(test.split(".", "-"))
    println(test.split("[.\\-]".toRegex()))
    val regex = """\.""".toRegex()
    println(regex.matchEntire("Hi.Hello"))
}