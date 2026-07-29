class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums.get(i);
        }
        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(i==0){
                    dp[i][j]=-1;
                }
                if(j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                if(arr[i-1]<=j){
                    if(dp[i-1][j-arr[i-1]]!=-1){
                        dp[i][j]=Math.max(dp[i-1][j-arr[i-1]]+1,dp[i-1][j]);
                    }
                    else{
                    dp[i][j]=dp[i-1][j];
                    }
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}