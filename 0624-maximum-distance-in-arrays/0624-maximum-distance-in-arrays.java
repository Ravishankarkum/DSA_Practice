class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> list=arrays.get(0);
        int max=list.get(list.size()-1);
        int min=list.get(0);
        int res=0;
        for(int i=1;i<arrays.size();i++){
            List<Integer> ans=arrays.get(i);
            int currmin=ans.get(0);
            int currmax=ans.get(ans.size()-1);
            res=Math.max(res,Math.max(Math.abs(currmin-max),Math.abs(currmax-min)));
            max=Math.max(max,currmax);
            min=Math.min(min,currmin);
        }
        return res;
        
    }
}