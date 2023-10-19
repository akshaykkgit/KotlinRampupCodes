package interview
/*
fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<Int> {
    var carry = 0
    val result = mutableListOf<Int>()
    var index1 = l1.size - 1
    var index2 = l2.size - 1

    while (index1 >= 0 || index2 >= 0 || carry > 0) {
        val digit1 = if (index1 >= 0) l1[index1] else 0
        val digit2 = if (index2 >= 0) l2[index2] else 0
        val sum = digit1 + digit2 + carry
        carry = sum / 10
        result.add(sum % 10)
        index1--
        index2--
    }

    return result
}*/
fun addTwoNumbers(l1:List<Int>,l2:List<Int>):List<Int>{
    val result= mutableListOf<Int>()

    var index1=l1.size-1
    var index2=l2.size-1
    var carry=0


    while (index1>0 || index1>0 || carry>0){
        val sum=l1[index1]+l2[index1]+carry
        carry=sum/10
        result.add(sum%10)
        index1--
        index1--

    }

    return  result
}

fun main() {
    val l1 = listOf(2, 4, 3)
    val l2 = listOf(5, 6, 4)
    val output = addTwoNumbers(l1, l2)
    println(output) // Output: [7, 0, 8]
}