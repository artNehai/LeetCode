package easy.palindrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var left = 0
        var right = str.lastIndex
        repeat(str.length / 2) {
            if (str[left] != str[right]) {
                return false
            }
            left++
            right--
        }
        return true
    }
}