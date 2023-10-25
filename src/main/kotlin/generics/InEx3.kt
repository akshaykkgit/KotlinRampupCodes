class InClass<in T> {
    //method that only be consuming a value of type T. Then,
    // we can assign a reference of type Number to the reference of its subtype – Int:
    fun toString(value: T): String {
        return value.toString()
    }
}
/*
If we want to assign super type Obt to the reference of its subtype then we can use
the in keyword on the generic type. The in keyword can be used only on
the parameter type that is consumed, not produced:
*/
fun main() {
    val inClassObject: InClass<Number> = InClass<Number>()
    val ref: InClass<Int> = inClassObject
    print(ref.toString())
}
