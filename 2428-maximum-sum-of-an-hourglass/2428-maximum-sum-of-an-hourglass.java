class Solution {
    public int maxSum(int[][] grid) {
        int max=0;
        for(int i=0;i<=grid.length-3;i++){
            for(int j=0;j<=grid[0].length-3;j++){
                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]
                +grid[i+1][j+1]
                +grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                max=Math.max(max,sum);
            }
        }
        return max;

    }
}
// 00,01,02   |     01,02,03 (c+1)
//   11       |        12    (c+2)
// 20,21,22   |     21,22,23 (c+1)

// 10,11,12 (r+1)      |     11,12,13
//    21    (r+1)      |        22
// 30,31,32 (r+1)      |     31,32,33