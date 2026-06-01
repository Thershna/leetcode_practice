class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] sorted=score.clone();
        Arrays.sort(sorted);
        int r=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            map.put(sorted[i],r++);

        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            int rn=map.get(score[i]);
            if(rn==1){
                ans[i]="Gold Medal";
            }
            else if(rn==2){
                ans[i]="Silver Medal";
            }
            else if(rn==3){
                ans[i]="Bronze Medal";
            }
            else{
                ans[i]=String.valueOf(rn);
            }
        }
        return ans;
        
    }
}