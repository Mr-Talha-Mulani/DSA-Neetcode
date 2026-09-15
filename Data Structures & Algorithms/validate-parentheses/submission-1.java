class Solution {

    static boolean matches(char open, char close){
        return ((open =='(' && close == ')')||(open == '{' && close == '}')||(open == '[' && close == ']'));
    }

    static boolean isOpen(char brac){
        return (brac == '(' || brac == '{' || brac == '[');
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(isOpen(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char open = st.pop();
                if(!matches(open, ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
