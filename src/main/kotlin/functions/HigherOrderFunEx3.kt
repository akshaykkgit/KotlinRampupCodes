package functions

fun printFilteredNames(names: List<Int>, filterCondition: (Int) -> Boolean) {
    names.filter(filterCondition).forEach { println(it) }
}

fun returnFilteredNames(name: List<String>, filterCondition: (String) -> Boolean): List<String> {
    return name.filter(filterCondition)
}

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    printFilteredNames(list) { it % 2 == 0 }
    val strList = listOf("Akshay", "Mridul", "Julie", "Umaib")
    val filtered = returnFilteredNames(strList) { it.startsWith("A", ignoreCase = true) }
    println(filtered)
}