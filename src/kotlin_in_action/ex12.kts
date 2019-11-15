package kotlin_in_action

// 클래스 위임
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { // MutableCollection 의 구현을 innerSet 에게 위임한다.
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

val cset = CountingSet<Int>()
cset.addAll(listOf(1, 1, 2))
println("${cset.objectsAdded}, ${cset.size}")