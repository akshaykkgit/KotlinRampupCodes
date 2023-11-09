package functions
 class Circle(val r:Double){
  fun area():Double=3.14*r*r
}
fun Circle.perimeter():Double=2*3.14*r
fun main() {
    val circle=Circle(5.00)
    println(circle.perimeter())
}