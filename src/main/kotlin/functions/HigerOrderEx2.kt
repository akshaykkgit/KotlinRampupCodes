package functions

fun highOrder(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}
fun add(a:Int,b:Int):Int{
    return a+b
}
fun sub(a:Int,b:Int):Int{
    return a-b
}
fun main() {
    val ar= highOrder(2,4,::add)
    val sr= highOrder(3,2,::sub)
    println("Add res=$ar,Sub res=$sr")
}