class Solution {
    public  int getValue(int[][] series,int t) {
        int low=0; 
        int high=series.length-1;
        int idx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(series[mid][0]>=t){
                idx=mid;
                high=mid-1;
            } 
            else{
                low=mid+1;
            }
        }
        return (idx==-1)?0:series[idx][1];
    }
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<int[]> list=new ArrayList<>();
        for(int arr[]:series1){
            list.add(new int[]{arr[0],0});
        }
        for(int arr[]:series2){
            list.add(new int[]{arr[0],0});
        }
        Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> dup=new ArrayList<>();
        for(int []arr:list){
            if(dup.isEmpty() || dup.get(dup.size()-1)[0]!=arr[0]){
                dup.add(arr);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int[] arr:dup) {
            int t=arr[0];
            int val1=getValue(series1,t);
            int val2=getValue(series2,t);
            res.add(Arrays.asList(t,val1+val2));
        }
        return res;

    }
}