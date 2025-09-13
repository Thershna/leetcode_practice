class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=gain[0];
        for(int i=1;i<n;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=0;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        return max;
        
    }
}