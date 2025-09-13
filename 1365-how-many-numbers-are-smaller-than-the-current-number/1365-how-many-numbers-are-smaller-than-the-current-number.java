class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length-1;
        int count;
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            count=0;
            for(int j=0;j<=n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
        
    }
}