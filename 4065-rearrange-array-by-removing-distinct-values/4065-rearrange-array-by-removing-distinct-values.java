class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int dis[]=new int[map.size()];
        int i=0;
        for(Map.Entry<Integer,Integer> temp:map.entrySet()){
            int key=temp.getKey();
            dis[i++]=key;
        }
        Arrays.sort(dis);
        int index=0;
        while(index<nums.length){
        for(int j=0;j<dis.length;j++){
            int key=dis[j];
            if(map.containsKey(key) && map.get(key)>0){
                ans[index++]=key;
               map.put(dis[j],map.get(dis[j])-1);
            }
        }

        }
        return ans;

    }
}