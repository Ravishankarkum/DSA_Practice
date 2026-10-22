class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int r=0;
        int c=0;
        vis[0][0]=true;
        while(true){
            char dir=grid[r][c];
            int nr=r;
            int nc=c;
            if(dir=='U'){
                nr--;
            }
            else if(dir=='D'){
                nr++;
            }
            
            else if(dir=='R'){
                nc++;
            }
            
            else if(dir=='L'){
                nc--;
            }
            if(nr<0|| nr>=m ||nc<0 || nc>=n || vis[nr][nc]){
                return new int[]{r,c};
            }
            vis[nr][nc]=true;
            r=nr;
            c=nc;
        }
    }
}