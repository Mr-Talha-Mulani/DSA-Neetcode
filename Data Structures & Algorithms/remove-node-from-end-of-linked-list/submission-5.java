class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int k = length - n;

        // Dummy node handles the case where the head is removed
        ListNode dummy = new ListNode(0, head);
        curr = dummy;

        while (k != 0) {
            curr = curr.next;
            k--;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}