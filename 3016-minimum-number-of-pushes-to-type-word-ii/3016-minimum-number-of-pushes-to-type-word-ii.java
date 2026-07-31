class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.values());
       
        Collections.sort(list);
        Collections.reverse(list);
        int c=0;
        int sum=0;
        for(int i=0;i<list.size();i++){
            int push=(i/8)+1;
            c+=list.get(i)*push;
        }
       return c;

    }
}