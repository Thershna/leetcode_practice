class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
        int[] arr=new int [len];
        int k=0;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0){
                arr[k++]=nums[i];
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]%2!=0){
                arr[k++]=nums[i];
            }
        }
        return arr;

        
    }
}