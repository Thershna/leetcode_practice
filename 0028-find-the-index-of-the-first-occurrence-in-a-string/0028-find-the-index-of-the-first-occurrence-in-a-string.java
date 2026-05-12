class Solution {
    public int strStr(String haystack, String needle) {
        int len=haystack.length();
        int index=-1;
        for(int i=0;i<=len-needle.length();i++){
            int count=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
                
            }
            if(count==needle.length()){
                    index=i;
                    break;
            }
        }
        return index;
        
    }
}