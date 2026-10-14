class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];

        leftsum[0]=0;
        rightsum[n-1]=0;
        for(int i=1;i<n;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        int totalsum=0;
        for(int x:nums){
            totalsum+=x;
        }
        for(int i=0;i<n-1;i++){
            rightsum[i]=totalsum-nums[i];
            totalsum-=nums[i];
        }
        int diff[]=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return diff;


    }
}