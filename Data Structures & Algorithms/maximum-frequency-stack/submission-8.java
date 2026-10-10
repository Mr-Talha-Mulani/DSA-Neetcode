class FreqStack {
    HashMap<Integer, Stack<Integer>> h;
    HashMap<Integer, Integer> h2 = new HashMap<>();
    int maxFreq = 0;
    public FreqStack() {
        h = new HashMap<>();
    }
    
    public void push(int val) {
        h2.put(val, h2.getOrDefault(val, 0)+1);
        int freq = h2.get(val);
        if(maxFreq <= freq){
            maxFreq = freq;
        }
        if(!h.containsKey(freq)){
            h.put(freq, new Stack<>());
        }
            Stack<Integer> s = h.get(freq);
            s.push(val);
            h.put(freq, s);
    }
    
    public int pop() {
        while(maxFreq > 0 && h.get(maxFreq).size()==0){
            maxFreq--;
        }
        int popped = h.get(maxFreq).pop();
        h2.put(popped , h2.get(popped)-1);
        return popped;

    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

 /*
 In this problem, what I am thinking of doing is making a hashamp that stores freq -> stack, where I will maintain a maxFreq variable that keep track of maxFreq of the map and pop simply 
 */