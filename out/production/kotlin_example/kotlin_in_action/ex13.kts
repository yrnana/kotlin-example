package kotlin_in_action

import java.io.File

class Person(val name: String, val salary: Int)

// 싱글턴 선언
object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        var sum: Int = 0
        for (person in allEmployees) {
            sum += person.salary
        }
        println("salary sum is $sum")
    }
}

Payroll.allEmployees.add(Person("수지", 1000))
Payroll.allEmployees.add(Person("재희", 2000))
Payroll.calculateSalary()

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

val files = listOf(File("/Z"), File("/a"))
println(files.sortedWith(CaseInsensitiveFileComparator))

data class Person2(val name: String) {
    object NameComparator : Comparator<Person2> {
        override fun compare(o1: Person2, o2: Person2): Int = o1.name.compareTo(o2.name)
    }
}

val persons = listOf(Person2("Bob"), Person2("alice"))
println(persons.sortedWith(Person2.NameComparator))