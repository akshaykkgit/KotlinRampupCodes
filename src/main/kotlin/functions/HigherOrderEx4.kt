package functions

fun buildString(builderAction: StringBuilder.() -> Unit): String {
    val stringBuilder=StringBuilder()
    stringBuilder.builderAction()
    return stringBuilder.toString()
}

fun main() {
    val str= buildString {
        append("Akshay")
        append(" KK")
    }
    println(str)

}