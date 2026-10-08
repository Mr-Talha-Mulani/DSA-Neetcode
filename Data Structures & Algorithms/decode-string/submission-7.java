class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder curr = new StringBuilder("");
        int num = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            else if(ch == '['){
                numStack.push(num);
                stringStack.push(curr.toString());
                num = 0;
                curr.setLength(0);
            }
            else if(ch ==']'){
                String prev = stringStack.pop();
                StringBuilder temp = new StringBuilder();
                int k = numStack.pop();
                while(k-- > 0){
                    temp.append(curr);
                }
                curr = new StringBuilder(prev+temp);
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}