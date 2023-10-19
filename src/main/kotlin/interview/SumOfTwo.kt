package interview

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIndex = HashMap<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (numToIndex.containsKey(complement)) {
            return intArrayOf(numToIndex[complement]!!, i)
        }
        numToIndex[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}
//fun sumOfTwo(nums:IntArray,target:Int){
//    var indexedValue=HashMap<Int,Int>()
//    for (i in nums.indices){
//        val compl=nums[i]-target
//        if(indexedValue.containsKey(compl)){
//            return IntArray(indexedValue[compl]!!,i)
//        }
//        indexedValue[i]=
//    }
//}
fun simpleSumofTwo(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in nums.indices) {
            if(nums[i]+nums[j]==target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf()
}

fun main() {
    val nums = intArrayOf(2, 7, 8,11)
    val target = 9
    val result = twoSum(nums, target)
    val result2 = simpleSumofTwo(nums, target)
    println(result.contentToString())
    println(result2.contentToString())
}