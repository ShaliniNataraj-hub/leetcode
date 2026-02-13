// Last updated: 2/13/2026, 9:46:41 AM
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        // Step 1: Store all values from linked list into ArrayList
        ListNode temp = head;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Use two-pointer approach to check palindrome
        int left = 0, right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
