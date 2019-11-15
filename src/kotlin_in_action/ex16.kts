package kotlin_in_action

val list = listOf(1, 2, 3, 4)
println(list.filter { it % 2 == 0 })
println(list.map { it * it })

data class Person(val name: String, val age: Int)

val people = listOf(Person("Bob", 31), Person("James", 20))
println(people.filter { it.age > 25 }.map(Person::name))

val numbers = mapOf(0 to "zero", 1 to "one")
println(numbers.mapValues { it.value.toUpperCase() })
println(numbers.values.map { it.toUpperCase() })

val canBeInClub27 = { p: Person -> p.age >= 27 }
println(people.all(canBeInClub27))
println(people.any(canBeInClub27))
println(people.count(canBeInClub27)) // filter{}.size 보다 효율적임
println(people.find(canBeInClub27)) // firstOrNull 과 같다
println(people.groupBy { it.age })

val list2 = listOf("a", "ab", "b")
println(list2.groupBy(String::first))

val strings = listOf("abc", "def")
println(strings.flatMap { it.toList() })