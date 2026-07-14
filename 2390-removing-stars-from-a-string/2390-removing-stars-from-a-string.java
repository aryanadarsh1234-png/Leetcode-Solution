class Solution {
    public String removeStars(String s){


        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        for(char ch : stack){
            res.append(ch);
        }

        return res.toString();

    }
}