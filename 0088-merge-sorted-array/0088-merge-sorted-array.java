class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            nums[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            nums[k++]=nums2[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<m+n;i++){
            nums1[i]=nums[i];
        }
    }
}