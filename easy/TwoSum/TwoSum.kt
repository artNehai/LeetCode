package easy.TwoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberToIndexMap = mutableMapOf<Int, Int>()
        for (indexA in nums.indices) {
            val a = nums[indexA]
            val b = target - a
            val indexB: Int? = numberToIndexMap[b]

            if (indexB != null) {
                return intArrayOf(indexA, indexB)
            }
            else {
                numberToIndexMap[a] = indexA
            }
        }
        return intArrayOf()
    }
}