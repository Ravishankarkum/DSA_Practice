class Solution {
    public int minDeletions(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
            else{
                c++;
            }
            list.add(nums[nums.length-1]);

        }
        return c;
        
    }
}