class Solution {
    public int heightChecker(int[] heights) {
        int[] he=heights.clone();
        Arrays.sort(he);
        int k=0;
        for(int i=0;i<he.length;i++){
            if(heights[i]!=he[i]){
                k++;
            }
        }
        return k;
        
    }
}