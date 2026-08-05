class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        int dp[][]=new int[n+1][amount+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<amount+1;j++){
                if(j==0){
                    dp[i][j]=0;
                }
                if(i==0){
                    dp[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        int k=1;
        for(int i=1;k<amount+1;k++){
            if(k%coins[0]==0){
                dp[i][k]=k/coins[0];
            }
            else{
                dp[i][k]=Integer.MAX_VALUE-1;
            }
        }
        for(int i=2;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1]<=j){
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        if(dp[n][amount]==Integer.MAX_VALUE-1){
            return -1;
        }
        return dp[n][amount];
    
    
    }
}