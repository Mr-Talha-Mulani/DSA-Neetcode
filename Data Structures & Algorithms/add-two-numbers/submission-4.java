
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        int carry = 0;

        ListNode dumm = new ListNode();
        ListNode last = dumm;

        while (curr1 != null || curr2 != null || carry != 0) {
            int val = carry;

            if (curr1 != null) {
                val += curr1.val;
                curr1 = curr1.next;
            }

            if (curr2 != null) {
                val += curr2.val;
                curr2 = curr2.next;
            }

            ListNode nn = new ListNode(val % 10);
            carry = val / 10;

            last.next = nn;
            last = nn;
        }

        return dumm.next;
    }
}

