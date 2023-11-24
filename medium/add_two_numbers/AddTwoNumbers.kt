package medium.add_two_numbers

class Solution {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        var trav1: ListNode? = l1
        var trav2: ListNode? = l2
        val result = ListNode(0)
        var travResult = result
        var remainder = 0

        while (trav1?.value != null || trav2?.value != null) {
            val interSum = (trav1 innerSum trav2) + remainder
            remainder = if (interSum >= 10) 1 else 0

            val next = ListNode(0)
            travResult.value = interSum % 10
            travResult.next = next
            travResult = next

            trav1 = trav1?.next
            trav2 = trav2?.next
        }
        return result
    }

    private infix fun ListNode?.innerSum(l2: ListNode?): Int =
        (this?.value ?: 0) + (l2?.value ?: 0)
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}


/*
fun main() {
    val one = ListNode(1)
    val two = ListNode(2)
    val seven = ListNode(7)
    one.next = two
    two.next = seven

    val four = ListNode(4)
    val five = ListNode(5)
    four.next = five

    val s = Solution()
    var result: ListNode? = s.addTwoNumbers(one, four)
    print(result?.value)
    result = result?.next
    print(result?.value)
    result = result?.next
    print(result?.value)
}*/
