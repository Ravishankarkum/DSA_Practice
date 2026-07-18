class Solution {
    public static int gcd(int a,int b){
    if(b==0){
    return a;
    }
    return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
    int max1=nums[0];
        for(int i=0;i<nums.length;i++){
         max1=Math.max(max1,nums[i]);
         }
         int min1=nums[0];
           for(int i=0;i<nums.length;i++){
         min1=Math.min(min1,nums[i]);
         }
         return gcd(max1,min1);
    }
}