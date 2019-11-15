package kotlin_in_action

// 지연계산
data class Person(val name: String, val age: Int)

val people = listOf(Person("Bob", 31), Person("James", 20))
//people.map(Person::name).filter { it.startsWith("B") }
people.asSequence().map(Person::name).filter { it.startsWith("B") }.toList()
listOf(1, 2, 3, 4).asSequence()
    .map { print("map($it) "); it * it }
    .filter { print("filter($it) "); it % 2 == 0 }
    .toList()