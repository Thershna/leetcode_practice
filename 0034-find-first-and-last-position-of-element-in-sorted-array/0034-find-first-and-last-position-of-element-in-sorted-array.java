class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=check(nums,target,true);
        int end=check(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

        
    }
    int check(int[] nums,int target,boolean findstartindex){
        int start=0;
        int end=nums.length-1;
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}