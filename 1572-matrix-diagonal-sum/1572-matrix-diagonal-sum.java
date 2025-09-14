class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                
            }
            sum+=mat[i][n-1-i];
            
        }
        if(n%2!=0){
            int m=n/2;
            sum-=mat[m][m];

        }
        
        return sum;
        
    }
}