class Solution {
    public int maxVowels(String s, int k) {
        int len=s.length();
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isv(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<len;i++){
            if(isv(s.charAt(i-k))){
                count--;
            }
            if(isv(s.charAt(i))){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;

        
        
    }
    public boolean isv(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}