class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                n++;
            }
            else{
                return n;
            }

        }
        return n;
        
    }
}