class Solution {
    public int maxProduct(int[] nums) {
        int f=1;
        int r=1;
         int maxProd = Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            if(f==0){
                f=1;
            }
            if(r==0){
                r=1;
            }
            f*=nums[i];
            r*=nums[nums.length-i-1];
            maxProd=Math.max(maxProd,Math.max(f,r));
         }
         return maxProd;
        
        
    }
}