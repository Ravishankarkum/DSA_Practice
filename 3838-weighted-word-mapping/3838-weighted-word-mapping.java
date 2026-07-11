class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer,Character> map=new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            map.put('z'-ch,ch);
        }
        int i=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char c='a';c<='z';c++){
            map1.put(c,weights[i++]);
        }
        StringBuilder sb=new StringBuilder();

        for(String s:words){
            char arr[]=s.toCharArray();
            int sum=0;
            for(char c:arr){
                int x=map1.get(c);
                sum+=x;
            }
            int y=sum%26;
            sb.append(map.get(y));
        }
        return sb.toString();
    }
}