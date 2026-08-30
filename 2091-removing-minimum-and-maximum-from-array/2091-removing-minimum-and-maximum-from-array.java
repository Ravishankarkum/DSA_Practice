class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minidx=-1;
        int maxidx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxidx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minidx=i;
            }
        }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int ff=right+1;
        int bb=nums.length-left;
        int fb=(left+1)+(nums.length-right);
        return Math.min(ff,Math.min(fb,bb));

    }
}