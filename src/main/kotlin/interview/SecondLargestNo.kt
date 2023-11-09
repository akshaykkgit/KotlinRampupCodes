package interview

fun findSecondLargest(numbers: IntArray): Int {
    if (numbers.size < 2) {
        throw IllegalArgumentException("Array should have at least two elements")
    }

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (number in numbers) {
        if (number > largest) {
            secondLargest = largest
            largest = number
        } else if (number > secondLargest && number != largest) {
            secondLargest = number
        }
    }

    return secondLargest
}

fun main() {
    val numbers = intArrayOf(5, 10, 2, 8, 15, 12)
    val secondLargest = findSecondLargest(numbers)
    println("The second largest number is: $secondLargest")
}