package easy.palindrome_number

class Solution {
    fun isPalindrome(number: Int): Boolean {
        val str = number.toString()
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

class SolutionWithoutStrings {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        var number = x
        var reversed = 0
        fun isNotHalved(): Boolean =
            try {
                number / reversed > 1
            } catch (e: ArithmeticException) {
                false
            }

        do {
            val lastDigit = number % 10
            reversed = (reversed * 10) + lastDigit
            number /= 10
        } while (isNotHalved())

        if (reversed > number) {
            reversed /= 10
        }
        return reversed == number
    }
}