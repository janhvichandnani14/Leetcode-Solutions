class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[nums1.length];
    for(int num:nums2){
        while(!stk.isEmpty()&& stk.peek()<num){
            hm.put(stk.pop(),num);
        }
        stk.push(num);
    }

        while(!stk.isEmpty()){
           hm.put(stk.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}