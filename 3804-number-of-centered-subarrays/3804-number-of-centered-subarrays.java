class Solution {
    public int centeredSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            ArrayList<Integer> list=new ArrayList<>();
            
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                list.add(nums[j]);
                if(list.contains(sum)){
                    c++;
                }
                

            }
        }
        return c;
    }
}