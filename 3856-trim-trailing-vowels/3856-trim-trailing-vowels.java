class Solution {
    public String trimTrailingVowels(String s) {

        int left = 0;

        int right = s.length()-1;

        while(right >=0){
            if(isVowel(s.charAt(right))){
                right--;
            }
            else{
                break;
            }

        }
        return s.substring(left,right+1);
        
    }
    boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u');
    }
}