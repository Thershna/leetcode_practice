class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int merged[]=new int[m+n];
        int k=0,i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merged[k++]=nums1[i++];
            }
            else{
                merged[k++]=nums2[j++];
            }
        }
        while(i<m) merged[k++]=nums1[i++];
        while(j<n) merged[k++]=nums2[j++];

       
        int ln=merged.length;
        if(ln%2==0){
            int mid=ln/2;
            double sum=(merged[mid]+merged[mid-1])/2.0;
            return sum;
        }
        else{
            int mid=ln/2;
            int result=merged[mid];
            return result;
        }
    }
}