class Solution {
    public String minRemoveToMakeValid(String s) {


        Stack<Integer> stack = new Stack<>();

        char[] sArr = s.toCharArray();

        for(int i = 0 ; i < sArr.length ; i++){
            if(sArr[i]=='(') {
                stack.push(i);
                }

            else if(sArr[i]==')' && !stack.isEmpty()){
                stack.pop();

            } 
            else if(sArr[i]==')'){
                 sArr[i]='.';
            }
        }

        while(!stack.isEmpty()){
            int curIdx = stack.pop();
            sArr[curIdx] = '.';
            
        }

        StringBuilder sb = new StringBuilder();
        for(char c : sArr){
            if(c!='.'){
                sb.append(c);
            }

        }
        return sb.toString();
        
    }
}