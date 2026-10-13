class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int y:nums){
            total+=y;
        }
        int target=total-x;
        if(target<0){
            return -1;
        }
        if(target==0){
            return nums.length;
        }
        int left=0;
        int winsum=0;
        int maxlen=-1;
        for(int right=0;right<nums.length;right++){
            winsum+=nums[right];
            while(winsum>target){
                winsum-=nums[left];
                left++;
            }
            if(winsum==target){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
            return maxlen==-1?-1:nums.length-maxlen;

        
    }
}