class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        double max_avg=Double.NEGATIVE_INFINITY;
        double avg=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            if(right-left+1 >k){
                sum-=nums[left];
                left++;
            }

            if(right-left+1 ==k ){
                avg=(double)sum/k;
                max_avg=Math.max(max_avg,avg);
            }
        }
      return max_avg;
    }
}