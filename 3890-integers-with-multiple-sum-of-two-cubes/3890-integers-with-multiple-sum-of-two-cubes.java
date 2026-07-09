class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp=(int)Math.cbrt(n);
        for(int i=1;i<=temp;i++){
            for(int j=i;j<=temp;j++){
                int num = (i*i*i) + (j*j*j);
                if(num<=n){
                    map.put(num,map.getOrDefault(num,0)+1);
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> t : map.entrySet()){
            int n1 = t.getKey();
            int n2 = t.getValue();
            if(n2>=2){
                list.add(n1);
            }
        }
        Collections.sort(list);
        return list;
    }
}
