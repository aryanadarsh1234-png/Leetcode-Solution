class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.empty()) return false;

                char topElement = st.pop();
                if(c == ')' && topElement !='('){
                    return false;
                }
                else if(c==']' && topElement!='['){
                    return false;
                }
                else if(c=='}' && topElement !='{'){
                    return false;
                }
            }

        }
        if(st.empty()){
            return true;
        }
        else{
           return false;
        }
        
    }
}