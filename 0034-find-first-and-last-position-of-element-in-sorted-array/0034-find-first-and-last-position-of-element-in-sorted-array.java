class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int first=binarySearch(nums,target,true);
        int last=binarySearch(nums,target,false);
       ans[0]=first;
       ans[1]=last;
       return ans;

    }
    private int binarySearch(int[] nums,int target,boolean isSearchingleft){
        int start=0;
        int end=nums.length-1;
        int idx=-1;

       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]>target){
            end=mid-1;
        }else if(nums[mid]<target){
            start=mid+1;
        }else{
            idx=mid;
            if(isSearchingleft){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
       }
 return idx;

    }
}