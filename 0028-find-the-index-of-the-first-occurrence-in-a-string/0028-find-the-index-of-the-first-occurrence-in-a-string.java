class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        if(n==0) return 0;
        for(int i=0;i<=h-n;i++){
            String sub=haystack.substring(i,i+n);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}