class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int rows=grid.length;
        int cols=grid[0].length;
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int min=0;
        //boolean mins=false;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean mins=false;
            for(int i=0;i<size;i++){
                int[] current=q.poll();
                int r=current[0];
                int c=current[1];
                for(int[] d:directions){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr>=0 && nr<rows && nc>=0 && nc<cols && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                        mins=true;
                    }
                }
            }
            if(mins){
                min++;
            }
        }
        return fresh==0?min:-1;

        
    }
}