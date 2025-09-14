class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            int minv=matrix[i][0];
            int colindex=0;
            for(int j=1;j<n;j++){
                if(matrix[i][j]<minv){
                    minv=matrix[i][j];
                    colindex=j;
                }
            }
            int maxv=matrix[0][colindex];
            for(int k=1;k<m;k++){
                if(matrix[k][colindex]>maxv){
                    maxv=matrix[k][colindex];
                }
            }
            if(minv==maxv){
                res.add(minv);
            }
        }
        return res;
        
    }
}