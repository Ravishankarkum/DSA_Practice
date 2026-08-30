class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int ans=-1;
        int i=0;
        for(int x[]:drones){
            int dis=Math.abs(x[0]-target[0])+Math.abs(x[1]-target[1]);
            if(dis<=x[2]){
                if(dis<min){
                    min=dis;
                    ans=i;
                }
            }
            i++;
            
        }
        return ans;
        
    }
}