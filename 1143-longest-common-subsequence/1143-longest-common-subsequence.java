class Solution {
    static int dp[][]=new int[1001][1001];
    public int LCS(String x,String y,int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(x.charAt(n-1)==y.charAt(m-1)){
            dp[n][m]=1+LCS(x,y,n-1,m-1);
        }
        else{
            dp[n][m]=Math.max(LCS(x,y,n,m-1),LCS(x,y,n-1,m));
        }
        return dp[n][m];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        for(int[] row:dp){
             Arrays.fill(row,-1);
        }
       
        return LCS(text1,text2,n,m);
    }
}