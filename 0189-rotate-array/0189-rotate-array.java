class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int[] nums1=new int[len];
        for(int i=0;i<len;i++){
            nums1[(i+k)%len]=nums[i];
        }
        for(int i=0;i<len;i++){
            nums[i]=nums1[i];
        }
        
    }
}