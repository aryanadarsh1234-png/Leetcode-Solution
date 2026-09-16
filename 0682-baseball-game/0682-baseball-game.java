class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();


        for(String op : operations){

            if(op.equals("+")){
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            }
            else if(op.equals("D")){
                int newScore = st.peek()*2;
                st.push(newScore);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int totalScore =0;
        for(int score : st){
            totalScore+=score;
        }
        return totalScore;
        
    }
}