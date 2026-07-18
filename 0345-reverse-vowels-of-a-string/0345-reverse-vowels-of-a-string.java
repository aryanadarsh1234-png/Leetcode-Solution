class Solution {
    public String reverseVowels(String s) {

        HashSet<Character> set = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        ));
         
        
        char[] strArr = s.toCharArray();
        int n = strArr.length;
        int left = 0 ; 
        int right = n-1;

        while(left < right){

            while(left < right && !set.contains(strArr[left])){
                left++;
            }
            while(left < right && !set.contains(strArr[right])){
                right--;
            }
            if(left < right){
                swap( strArr , left , right);
                left++;
                right--;

            }

        }
        return new String(strArr);
        
    }
    private void swap(char[] strArr , int left , int right){
        
        char temp = strArr[left];
        strArr[left] = strArr[right];
        strArr[right] = temp;
    }
}