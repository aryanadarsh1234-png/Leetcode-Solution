class Solution {
    public boolean detectCapitalUse(String word) {


        int number_of_upperChar =0;


        for(int i = 0 ; i < word.length() ; i++){
            if(Character.isUpperCase(word.charAt(i))){
                number_of_upperChar++;
            }

        }
       return (number_of_upperChar==word.length() ||
       (number_of_upperChar==0) ||
       ((number_of_upperChar == 1) && Character.isUpperCase(word.charAt(0))));
        
        
    }
}