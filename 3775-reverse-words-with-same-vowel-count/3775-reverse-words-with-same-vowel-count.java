class Solution {
    public static int count(String str){
            int c=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    c++;
                }
            }
        
        return c;
    } 
    public String reverseWords(String s) {
         String words[]=s.split(" ");
        int firstcount=count(words[0]);
        StringBuilder sb=new StringBuilder();
        sb.append(words[0]);
        for(int i=1;i<words.length;i++){
            if(count(words[i])==firstcount){
                sb.append(" ");
                sb.append(new StringBuilder(words[i]).reverse());
            }
            else{
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();


    }
}