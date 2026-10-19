class Solution {
    public String reverseWords(String s) {


        StringBuilder res = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){

            while(i>=0 && s.charAt(i)==' '){
            i--;
            }

            if(i<0) break;

            int end =i;

            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }

            if(res.length()>0){
                res.append(' ');
            }

            for(int start = i+1; start<=end ; start++){
                res.append(s.charAt(start));
            }
        }  
        return res.toString();
    }
}