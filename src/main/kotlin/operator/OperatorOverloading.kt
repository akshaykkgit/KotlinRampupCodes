package operator
data class Point(val x: Int, val y: Int)
operator fun Point.plus(other: Point) = Point(x + other.x, y + other.y)
operator fun Point.inc() =Point(x+1,y+1)

fun main() {
    val p1 = Point(0, 1)
    val p2 = Point(1, 2)
     println(p1 + p2)
    var p3=Point(1,1)
    println(++p3)
}

