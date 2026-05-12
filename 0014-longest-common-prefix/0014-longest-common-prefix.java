class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        String first=strs[0];
        if(len==0){
            return "";
        }
        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);
            for(int j=1;j<len;j++){
                if(i>=strs[j].length()|| strs[j].charAt(i)!=ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
        
    }
}