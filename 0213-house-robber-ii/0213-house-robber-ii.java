class Solution {
    public int houserobber(int nums[],int st,int end){
        int n=end-st+1;
        int dp[]=new int[n];
        dp[0]=nums[st];
        dp[1]=Math.max(dp[0],nums[st+1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[st+i]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
         if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int x=houserobber(nums,0,nums.length-2);
        int y=houserobber(nums,1,nums.length-1);
        return Math.max(x,y);
    }
}