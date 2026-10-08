class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                int fruit=fruits[left];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;
            }
        
        max=Math.max(max,i-left+1);
        }
        return max;
    }
}