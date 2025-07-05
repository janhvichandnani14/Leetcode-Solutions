class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans, -1);


        for(int i=2*n-1;i>=0;i--){
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[i%n]){
                stk.pop();
            }
           if(!stk.isEmpty()){
            ans[i%n]=nums[stk.peek()];
           }
           stk.push(i%n);
        }
        return ans;
    }
}