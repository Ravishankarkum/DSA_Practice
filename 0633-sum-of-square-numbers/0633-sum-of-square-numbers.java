class Solution {
    public boolean judgeSquareSum(int c) {
        long j=(long)Math.sqrt(c);
        long i=0;
        while(i<=j){
            if((i*i)+(j*j)==c){
                return true;
            }
            else if((i*i)+(j*j)<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}