class MyHashMap {
    class Node{
        int key;
        int value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    int mod = 10000;
    List<Node>[] hash ;
    public MyHashMap() {
        hash = new ArrayList[10000];
        for(int i = 0; i<10000; i++){
            hash[i] = new ArrayList<>();
        }
    }
    
    public Node search(int key, List<Node> arr){
        for(Node e : arr){
            if(e.key == key){
                return e;
            }
        }
        return null;
    }

    public void put(int key, int value) {
        int idx = key%mod;
        Node ans = search(key, hash[idx]);
        if(ans == null){
            Node nn = new Node(key, value);
            hash[idx].add(nn);
        }
        else{
            ans.value = value;
        }
    }
    
    public int get(int key) {
       int idx = key%mod;
       Node ans = search(key, hash[idx]); 
       if(ans == null){
        return -1;
       }
       return ans.value;
    }
    
    public void remove(int key) {
        int idx = key%mod;
        Node ans = search(key, hash[idx]);
        hash[idx].remove(ans);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */