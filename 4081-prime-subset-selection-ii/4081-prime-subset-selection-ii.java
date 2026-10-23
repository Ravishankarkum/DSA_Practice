class Solution {
    public boolean lexicographically(List<Integer> a, List<Integer> b){
    for(int i=0;i<a.size();i++) {
        if(!a.get(i).equals(b.get(i))){
            return a.get(i)<b.get(i);
        }
    }
    return false;
}
    
    public boolean isprime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
         return true;
    }
    public List<Integer> maxPrimeSubset(int n, int s) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                list.add(i);
            }
        }
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= s; i++) {
            dp.add(null);
        }
        dp.set(0, new ArrayList<>());
         for (int p : list) {
            for (int sum = s; sum >= p; sum--) {
                List<Integer> prev = dp.get(sum - p);
                if (prev == null) {
                    continue;
                }
                List<Integer> candidate=new ArrayList<>(prev);
                candidate.add(p);
                List<Integer> current = dp.get(sum);
                if (current == null|| candidate.size() < current.size()
                        || (candidate.size() == current.size()
                        && lexicographically(candidate, current))) {

                    dp.set(sum, candidate);
                }
            }
        }
        for (int sum = s; sum >= 1; sum--) {
            if (dp.get(sum) != null) {
                return dp.get(sum);
            }
        }

        return new ArrayList<>();
    }
}