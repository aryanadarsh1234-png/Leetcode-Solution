class Solution {
    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        Stack<StringBuilder> stringStack = new Stack<>();
        int number=0;


        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){
                number = number*10 + (ch-'0');
            }
            else if(ch=='['){
                numberStack.push(number);
                stringStack.push(curr);
                number =0;
                curr = new StringBuilder();
            }
            else if(ch==']'){
                int count = numberStack.pop();
                StringBuilder prev = stringStack.pop();
                for(int i = 0 ; i< count ; i++){
                    prev.append(curr);
                }
                curr = prev;
            }
            else{
                curr.append(ch);
            }

        }
        return curr.toString();
        
    }
}