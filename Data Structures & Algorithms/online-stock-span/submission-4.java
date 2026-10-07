class StockSpanner {
    class node{
            int val;
            int ans;
            node(int val, int ans){
                this.val = val;
                this.ans = ans;
            }
        }
        Stack<node> s ;
    public StockSpanner() {
        s = new Stack<>();
    }
    
    public int next(int price) {
        node nn = new node(price, 1);
        if(s.isEmpty() || s.peek().val > price){
            s.push(nn);
            return nn.ans;
        }
        else{
            while(!s.isEmpty() && s.peek().val <= price){
                node popped = s.pop();
                nn.ans += popped.ans;
            }
            s.push(nn);
            return nn.ans;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */