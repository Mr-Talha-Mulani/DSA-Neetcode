class Solution {
    class node {
        int idx;
        int h;
        node(int h, int idx) {
            this.idx = idx;
            this.h = h;
        }
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<node> s = new Stack<>();
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            node nn = new node(heights[i], i);
            if (s.isEmpty() || s.peek().h < nn.h) {
                s.push(nn);
            } else {
                int lastPoppedIdx = -1;
                while (!s.isEmpty() && s.peek().h >= nn.h) {
                    node popped = s.pop();
                    lastPoppedIdx = popped.idx;
                    int area = (popped.h) * (nn.idx - popped.idx);
                    maxArea = Math.max(maxArea, area);
                }
                nn.idx = lastPoppedIdx;
                s.push(nn);
            }
        }
        while (!s.isEmpty()) {
            node nn = s.pop();
            int area = (nn.h) * (n - nn.idx);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
