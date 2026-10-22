class Solution {
    public boolean threeFibonacciSum(int n) {
        long a=0;
        long b=1;
        long next=1;
       while(a+b+next<n){
            a=b;
            b=next;
            next=a+b;
            }
        
        return a+b+next==n;
    }
}