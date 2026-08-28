class MyHashSet {
        int mod = 10000;
        List<Integer>[] hash = new ArrayList[10000];
    public MyHashSet() {
        for(int i = 0; i<10000; i++){
            hash[i] = new ArrayList<>();
        }
    }
    
    public boolean search(List<Integer> arr, int target){
        for(int i : arr){
            if(i == target){
                return true;
            }
        }
        return false;
    }

    public void add(int key) {
        int idx = key%mod;
       if(!search(hash[idx], key)){
             hash[idx].add(key);
       }
    }
    
    public void remove(int key) {
        int idx = key%mod;
         hash[idx].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int idx = key%mod;
        return search(hash[idx], key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */