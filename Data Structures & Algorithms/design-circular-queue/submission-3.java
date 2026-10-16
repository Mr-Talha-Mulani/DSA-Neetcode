class MyCircularQueue {
    int[] q ;
    int f = -1;
    int r = -1;
    int size = 0;
    public MyCircularQueue(int k) {
        q = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(f == -1 && r == -1){
            f++;
            r++;
            q[r] = value;
            size++;
            return true;
        }
        else if((r+1)%q.length == f){
            return false;
        }
        else{
            r = (r+1)%q.length;
            q[r] = value;
            size++;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            f = -1;
            r = -1;
            return false;
        }
        else if(size == 1){
            q[f] = 0;
            f = -1;
            r = -1;
            size--;
            return true;
        }
        else{
            q[f] = 0;
            f  = (f+1)%q.length;
            size--;
            return true;
        }
    }
    
    public int Front() {
        if(f== -1){
            return -1;
        }
        return q[f];
    }
    
    public int Rear() {
        if(r == -1){
            return r;
        }
        return q[r];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == q.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */