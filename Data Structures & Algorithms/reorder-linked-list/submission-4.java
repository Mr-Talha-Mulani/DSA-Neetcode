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

    static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode front = head;
        while(front != null){
            ListNode temp = front.next;
            front.next = prev;
            prev = front;
            front = temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode first = head;
        ListNode sec = rev(slow.next);
        slow.next = null;
        while(sec != null){
            ListNode temp1 = first.next;
            first.next = sec;
            ListNode temp2 = sec.next;
            sec.next = temp1;
            sec = temp2;
            first = first.next.next;
        }
    }
}
