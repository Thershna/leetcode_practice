class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwords=0;
        for(String sent:sentences){
            int count=1;
            for(int i=0;i<sent.length();i++){
                if(sent.charAt(i)==' '){
                    count++;
                }
            }
            maxwords=Math.max(maxwords,count);
        }
        return maxwords;
        
        
    }
}