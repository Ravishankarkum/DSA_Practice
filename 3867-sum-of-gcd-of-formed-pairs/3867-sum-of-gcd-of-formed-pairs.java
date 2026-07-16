class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int max=0;
        int mxi[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            mxi[i]=max;
        }
        int prefixgcd[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefixgcd[i]=gcd(nums[i],mxi[i]);

        }
        Arrays.sort(prefixgcd);
        int x=0;
        for(int i=0;i<prefixgcd.length;i++){
            x=Math.min(x,prefixgcd[i]);
        }
        int y=0;
        for(int i=0;i<prefixgcd.length;i++){
            y=Math.max(y,prefixgcd[i]);
        }
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<j){
            int num=gcd(prefixgcd[i++],prefixgcd[j--]);
            sum+=num;
        }
        return sum;

    }
}