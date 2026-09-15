class MyStack {
    Queue<Integer> a  = new LinkedList<>();
    Queue<Integer> b  = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        a.offer(x);
    }
    
    public int pop() {
        int n = a.size()-1;
        while(n-- > 0){
            b.offer(a.poll());
        }
        int ans = a.poll();
        while(!b.isEmpty()){
            a.offer(b.poll());
        }
        return ans;
    }
    
    public int top() {
        int n = a.size()-1;
        while(n-- > 0){
            b.offer(a.poll());
        }
        int ans = a.peek();
        b.offer(a.poll());
        while(!b.isEmpty()){
            a.offer(b.poll());
        }
        return ans;
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */