class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        boolean flag=false;
        for(int x:nums1){
            if(x%2!=0){
                flag=true;
                minodd=Math.min(minodd,x);
            }
        }
        if(!flag){
            return true;
        }
        for(int y:nums1){
            if(y%2==0 && minodd>y){
                return false;
            }
        }
        return true;
    }
}