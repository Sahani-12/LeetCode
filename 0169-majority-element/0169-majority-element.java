class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int majorityElement=nums[n/2];
        return majorityElement;
        
    }
}