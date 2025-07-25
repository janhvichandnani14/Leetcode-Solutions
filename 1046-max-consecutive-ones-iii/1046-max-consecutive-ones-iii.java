class Solution {
    public int longestOnes(int[] nums, int k) {
       int left=0;
       int max_length=0;
       int count_zeros=0;
       for(int right=0;right<nums.length;right++){
        if(nums[right]==0){
        count_zeros++;
        }
        while(count_zeros>k){
            if(nums[left]==0){
                count_zeros--;
            }
            left++;
        }
        max_length=Math.max(max_length,right-left+1);
       } 
       return max_length;
    }
}