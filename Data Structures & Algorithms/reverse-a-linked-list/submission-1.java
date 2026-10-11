/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev, front;
        prev = null;
        front = head;
        while(front != null){
            ListNode temp = front.next;
            front.next = prev;
            prev = front;
            front = temp;
        }
        return prev;
    }
}
