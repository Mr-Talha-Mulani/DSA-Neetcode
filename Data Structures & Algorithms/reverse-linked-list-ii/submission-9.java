
class Solution {

    static ListNode rev(ListNode head) {
        ListNode rear = null;
        ListNode front = head;

        while (front != null) {
            ListNode temp = front.next;
            front.next = rear;
            rear = front;
            front = temp;
        }

        return rear;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode curr = dummy;

        // Reach the node immediately before the sublist.
        for (int i = 1; i < left; i++) {
            curr = curr.next;
        }

        ListNode prev = curr;
        ListNode sublistHead = prev.next;

        // Reach the last node of the sublist.
        for (int i = left; i <= right; i++) {
            curr = curr.next;
        }

        ListNode sublistTail = curr;
        ListNode nextNode = sublistTail.next;

        // Detach the sublist.
        sublistTail.next = null;

        // Reverse and reconnect.
        prev.next = rev(sublistHead);
        sublistHead.next = nextNode;

        return dummy.next;
    }
}
