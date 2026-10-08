class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        boolean arr[]=new boolean[fruits.length];
        for(int i=0;i<fruits.length;i++){
            boolean place=false;
            for(int j=0;j<baskets.length;j++){
                if(!arr[j] && baskets[j]>=fruits[i]){
                    arr[j]=true;
                    place=true;
                    break;
                }
            }
            if(!place){
                c++;
            }
        }
        return c;
    }
}