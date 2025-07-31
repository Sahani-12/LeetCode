class Solution {
    public long minimumSteps(String s) {
        long totalSwap=0;
        long black=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                totalSwap+=black;

            }
            else{
                black++;
            }
        }
        return totalSwap;
        
    }
}