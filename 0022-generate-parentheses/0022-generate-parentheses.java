class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        int open =0;
        int close =0;

        generateParenthesis(res,curr,open,close,n);
        return res;
        
    }
    void generateParenthesis(List<String> res , StringBuilder curr , int open , int close , int n){

        if(curr.length()==n*2){
            res.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            generateParenthesis(res,curr,open+1,close,n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            generateParenthesis(res,curr,open,close+1,n);
            curr.deleteCharAt(curr.length()-1);
            
        }

    }
}