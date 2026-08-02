class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<List<Integer>> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                list.add(nums[j]);
                ArrayList<Integer> curr=new ArrayList<>(list);
                if(set.add(curr)){
                    ans.add(curr);
                }
            }
        }
        for(int i=ans.size()-1;i>=0;i--){
            ArrayList<Integer> dis=ans.get(i);
            int c=0;
            for(int j=0;j<dis.size();j++){
                if(dis.get(j)%p==0){
                    c++;
                }
            }
            if(c>k){
             ans.remove(i);
            }
        }
      
       return ans.size();
       
    }
}