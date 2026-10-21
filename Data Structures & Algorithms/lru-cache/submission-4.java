
class LRUCache {

    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    HashMap<Integer, Node> h;
    Node head = null;
    Node tail = null;

    int size = 0;
    int cap;

    public LRUCache(int capacity) {
        h = new HashMap<>();
        cap = capacity;
    }

    // Insert a node at the head
    void addToHead(Node node) {
        node.prev = null;
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    // Remove a node from the linked list
    void removeNode(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        node.prev = null;
        node.next = null;
    }

    // Remove the least recently used node
    void deleteEnd() {
        if (tail == null) {
            return;
        }

        Node evicted = tail;

        // Move tail to the previous node
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        // Remove the evicted key from the HashMap
        h.remove(evicted.key);

        size--;
    }

    public int get(int key) {
        if (!h.containsKey(key)) {
            return -1;
        }

        Node node = h.get(key);

        // Mark this node as recently used
        removeNode(node);
        addToHead(node);

        return node.val;
    }

    public void put(int key, int value) {

        // If key already exists, update it
        if (h.containsKey(key)) {
            Node node = h.get(key);
            node.val = value;

            removeNode(node);
            addToHead(node);

            return;
        }

        // Evict LRU node if capacity is full
        if (size == cap) {
            deleteEnd();
        }

        // Create and insert the new node
        Node node = new Node(key, value);

        addToHead(node);
        h.put(key, node);

        size++;
    }
}
