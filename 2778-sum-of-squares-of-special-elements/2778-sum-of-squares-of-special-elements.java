class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(n%i==0){
                list.add(nums[i-1]);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i)*list.get(i);
        }
        return sum;
    }
}