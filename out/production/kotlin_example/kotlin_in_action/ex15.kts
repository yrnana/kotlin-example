package kotlin_in_action

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

val people = listOf(Person("Alice", 29), Person("Bob", 31))
findTheOldest(people)
println(people.maxBy { it.age })
println(people.maxBy(Person::age))
println(people.maxBy { p: Person -> p.age })

val sum = { x: Int, y: Int -> x + y }
println(sum(1, 2))

val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
println(names)
println(people.joinToString(" ") { p: Person -> p.name })

val sum2 = { x: Int, y: Int ->
    println("$x + $y = ${x + y}")
    x + y
}
println(sum2(3, 5))

// 람다 안에서 바깥 함수의 로컬 변수 변경하기
fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
printProblemCounts(responses)

// 멤버 참조
val getAge = Person::age
val getAge2 = { person: Person -> person.age }

fun salute() = println("Salute!")
run(::salute)

fun Person.isAdult() = age >= 21
println(people[0].isAdult())

val p = Person("Dmitry", 34)
val dmitryAgeFunc = p::age
println(dmitryAgeFunc())