class Solution {
    public int arrayNesting(int[] nums) {
         
        boolean vis[]=new boolean[nums.length];
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(vis[i]){
                continue;
            }
            int curr=i;
           
            int c=0;
            while(!vis[curr]){
                vis[curr]=true;
                c++;
                curr=nums[curr];
            }
            res=Math.max(res,c);
        }
        return res;
    }
}