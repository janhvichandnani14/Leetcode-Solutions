class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int actual_sum=0;
        for(int i=0;i<nums.length;i++){
            actual_sum+=nums[i];
        }
        int missing_num=sum-actual_sum;
        return missing_num;
    }
}