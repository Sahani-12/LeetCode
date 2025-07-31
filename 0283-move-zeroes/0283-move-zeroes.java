class Solution {
     int j;
    public void moveZeroes(int[] nums) {
       
        for(int i=0;i<nums.length-1;i++){
            for( j=i+1;j<nums.length;j++){
                if((nums[i]==0)&&(nums[j]!=0)){
                    int arr=nums[i];
                    nums[i]=nums[j];
                    nums[j]=arr;
                }
            }
        }
        System.out.println(nums);
        
    }
}