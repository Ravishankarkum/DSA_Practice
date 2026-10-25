class Solution {
    public int calculateScore(int a, int b) {
        String bin1=Integer.toBinaryString(a);
        String bin2=Integer.toBinaryString(b);
        int c1=0;
        int c2=0;
        for(int i=0;i<bin1.length();i++){
            if(bin1.charAt(i)=='1'){
                c1++;
            }
        }
         for(int i=0;i<bin2.length();i++){
            if(bin2.charAt(i)=='1'){
                c2++;
            }
        }
        if(c1>=c2){
            return c1*c2;
        }
        return (int)c2/c1;
    }
}