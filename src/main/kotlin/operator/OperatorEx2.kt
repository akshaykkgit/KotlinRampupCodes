package operator
operator fun Point.unaryMinus() =Point(-x,-y)
fun main() {
    val p = Point(4, 2)

    println(-p)
}