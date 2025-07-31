class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           if(isPalindrome(words[i])){
            return words[i];
           }
        }
        return "";
        
    }
    public static boolean isPalindrome(String words){
        int start=0;
        int end=words.length()-1;
        while(start<=end){
            if(words.charAt(start)!=words.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}