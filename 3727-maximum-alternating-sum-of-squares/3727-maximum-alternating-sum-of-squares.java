class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long sum=0;
        long sub=0;
        for(int i=n-1;i>=0;i--){
            if(i>=n/2){
                sum+=arr[i];
            }
            else{
                sub+=arr[i];
            }

        }  
        return sum-sub;
        
    
    }
}
