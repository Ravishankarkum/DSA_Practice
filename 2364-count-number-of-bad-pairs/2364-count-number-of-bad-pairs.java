class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long total=(long)n*(n-1)/2;
        long c=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i]-i;
            c+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return total-c;
    }
}