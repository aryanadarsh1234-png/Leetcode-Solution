class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        int open =0;
        int close = 0;
        helper(ans,n,curr,0,0);


        return ans;
        
    }
    public void helper(List<String> ans, int n, StringBuilder curr , int open ,int close){

        if(curr.length()==2*n){
            ans.add(curr.toString());
            return;
        }
        if(open < n){
            curr.append('(');
            helper(ans,n,curr,open+1,close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close < open){
            curr.append(')');
            helper(ans,n,curr,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
        
    }
}