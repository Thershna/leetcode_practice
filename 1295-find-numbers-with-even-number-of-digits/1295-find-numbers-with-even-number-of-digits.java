class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int m;
        int count=0;
        for(int i=0;i<n;i++){
            m=(int)(Math.log10(nums[i]))+1;
            if(m%2==0){
                count++;
            }
        }
        return count;
        
    }
}