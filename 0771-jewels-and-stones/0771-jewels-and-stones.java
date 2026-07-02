class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int je=jewels.length();
        int s=stones.length();
        int count=0;
        for(int i=0;i<s;i++){
            for(int j=0;j<je;j++){
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
        
    }
}