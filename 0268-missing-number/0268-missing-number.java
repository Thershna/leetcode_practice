class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int k=nums[n-1];
        for(int i=0;i<k;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return k+1;
        
    }
}