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
            if(list.size()>=3){
                int gap=list.get(1)-list.get(0);
                boolean flag=true;
                for(int i=1;i<list.size()-1;i++){
                    if(list.get(i+1)-list.get(i)!=gap){
                        flag=false;
                        break;
                    }
                }

                if (flag) {
                    c++;
                }
            }
        }

        
        return c;
    }
}