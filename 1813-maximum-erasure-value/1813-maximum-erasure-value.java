class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int left=0;
        int max_sum=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
             sum+=nums[right];
            set.add(nums[right]);
            max_sum=Math.max(max_sum,sum);
        }
        return max_sum;
    }
}