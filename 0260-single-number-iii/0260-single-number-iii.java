class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> t:map.entrySet()){
            int x=t.getValue();
            int y=t.getKey();
            if(x==1){
                res.add(y);
            }
        }
        int arr[]=new int[res.size()];
        int i=0;
        for(int z:res){
            arr[i++]=z;
        }
        return arr;
    }
}