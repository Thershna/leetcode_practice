class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2){
            return s;
        }
        int lenm=0;
        int max=1;
        int start=0;
        for(int i=0;i<len;i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            lenm=Math.max(len1,len2);
            if(lenm>max){
                max=lenm;
                start=i-(lenm-1)/2;
            }
            
        }
        return s.substring(start,start+max);


        
    }
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
            left--;
            right++;

        }
        return right-left-1;
    }
}