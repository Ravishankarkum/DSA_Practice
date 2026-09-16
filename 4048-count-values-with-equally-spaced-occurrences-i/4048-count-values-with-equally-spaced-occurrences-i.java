class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int c=0;
        for(Map.Entry<Integer,List<Integer>> temp:map.entrySet()){
            List<Integer> list=temp.getValue();
            if(list.size()==3){
                int i1=list.get(0);
                int i2=list.get(1);
                int i3=list.get(2);
                if(i2-i1==i3-i2){
                c++;
                }
            }

        }
        return c;
    }
}