class Solution {
    public int lengthOfLastWord(String s) {


        String[] wordArray = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        ans.append(wordArray[wordArray.length-1]);
        return ans.length();
        
    }
}