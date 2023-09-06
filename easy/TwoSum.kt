package easy

// https://leetcode.com/problems/two-sum/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..<nums.lastIndex) {
            val element1 = nums[i]
            for (j in i + 1..nums.lastIndex) {
                val element2 = nums[j]
                if (element1 + element2 == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

fun main() {
    println(Solution().twoSum(intArrayOf(3, 2, 4), 6).joinToString())
}