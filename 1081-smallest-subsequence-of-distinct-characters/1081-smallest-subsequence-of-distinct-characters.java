class Solution {
    public String smallestSubsequence(String s) {
        int f[]=new int[26];
        Stack<Character> st=new Stack<>();
        boolean vis[]=new boolean[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
        }
        for(char c:s.toCharArray()){
            f[c-'a']--;
        
        if(vis[c-'a']){
            continue;
        }
        while(!st.isEmpty() && st.peek()>c && f[st.peek()-'a']>0){
            vis[st.peek()-'a']=false;
            st.pop();
            
        }
        st.push(c);
            vis[c-'a']=true;
        }
        StringBuilder res=new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }
}
  