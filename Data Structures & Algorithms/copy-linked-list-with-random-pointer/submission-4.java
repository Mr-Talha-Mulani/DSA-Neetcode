/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> h = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Node nn = new Node(curr.val);
            h.put(curr, nn);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            Node curr2 = h.get(curr);
            curr2.next = h.get(curr.next);
            curr2.random = h.get(curr.random);
            curr = curr.next;
        }
        return h.get(head);
    }
}
