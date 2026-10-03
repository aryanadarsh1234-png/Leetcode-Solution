class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            switch(token){
               case "+":{
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
               case "*":{
                    stack.push(stack.pop() * stack.pop());
                    break;
                }
                case "-":{
                    int operant1 = stack.pop();
                    int operant2 = stack.pop();
                    stack.push(operant2-operant1);
                    break;
                }       
                case "/" :{
                    int operant1 = stack.pop();
                    int operant2 = stack.pop();
                    stack.push(operant2/operant1);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}