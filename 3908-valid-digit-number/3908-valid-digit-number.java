class Solution {
    public boolean validDigit(int n, int x) {
       if(n==0){
        return false;
       }
        ArrayList<Integer> res=new ArrayList<>();
        while(n!=0){
            int mod=n%10;
            res.add(mod);
            n/=10;
            
        }
        Collections.reverse(res);
        int arr[]=new int[res.size()];
        int i=0;
        for(int y:res){
            arr[i++]=y;
        }
        if(arr[0]==x){
            return false;
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]==x){
                return true;
                
            }
        }
        return false;
    }
}