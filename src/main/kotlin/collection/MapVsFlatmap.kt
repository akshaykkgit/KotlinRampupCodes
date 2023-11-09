package collection

import java.math.BigDecimal


fun main() {
//    Both map and flatMap can be applied to a Stream<T> and they both return a Stream<R> .
    //    The difference is that the map operation produces one output value for each input value,
    //    whereas the flatMap operation produces an arbitrary number (zero or more) values for each input value.
    val myList = listOf("a","b")
    val umap=myList.map { it-> listOf(it,it.uppercase()) }
    val fmap=myList.flatMap { it-> listOf(it,it.uppercase()) }
    println(umap)
    println(fmap)
    println(BigDecimal.valueOf(10.2222222))
}