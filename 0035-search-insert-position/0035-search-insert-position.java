class Solution {
     int a;
    public int searchInsert(int[] nums, int target) {
       
        for(int i=0;i<nums.length;i++){
            if((nums[i]==target)||(nums[i]>target)){
                 a=i;
                 break;
            }
            if(nums[i]!=target){
                a=nums.length;
            }
            
        }
        return a;
        
    }
}