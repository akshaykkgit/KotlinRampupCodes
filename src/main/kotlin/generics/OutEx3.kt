class OutClass<out T>(val value: T) {
/*    OutClass class that can produce a value of type T.
    hen, we can assign an instance of the OutClass to the reference that is a supertype of it:*/
    fun get(): T {
        return value
    }
}
/*
the out keyword on the generic type which means we can assign subtype reference
to any of its supertypes.
The out value can only produced by the given class but can not consumed:
*/
fun main() {
    val out = OutClass("data")
    val ref: OutClass<Any> = out
    val y: MyClasss<out Any> = MyClasss<String>() // Works since String is a subtype of Any
    val z: MyClasss<in String> = MyClasss<Any>()
}
class MyClasss<T>