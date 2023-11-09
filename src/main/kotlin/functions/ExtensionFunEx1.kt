package functions


class Person {
    fun move() {
        println("moved")
    }
}

class NetworkRepository {
    fun loadData() {
        println("Data loaded")
    }

}

fun Person.remoteDate() {
    println("Remote Data")
    move()
}

fun main() {
    val p = Person()
    p.remoteDate()
}