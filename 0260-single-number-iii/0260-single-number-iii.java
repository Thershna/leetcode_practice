class Solution {
    public int[] singleNumber(int[] nums) {
        int[] newn=new int[2];

        int l=0;
        for(int i=0;i<nums.length;i++){
            int k=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    k++;

                }
                
                
            }
            if(k==1){
                newn[l++]=nums[i];
                
            }
        }
        return newn;
        
    }
}