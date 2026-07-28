class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.values());
        Collections.sort(list);
        Collections.reverse(list);
        int left=0;
        int c=0;
        int half=arr.length/2;
        for(int x:list){
            left+=x;
            c++;
            if(left>=half){
                return c;
            }
        }
        return c;
    } 
}