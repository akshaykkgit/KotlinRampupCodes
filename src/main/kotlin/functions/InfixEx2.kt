package functions

import operator.Point

infix fun Point.addTo(other:Point):Point=Point(x+other.x,y+other.y)

fun main() {
    val r= Point(1,1 ) addTo Point(2,2)
    println(r)
}