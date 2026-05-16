class Solution {
    public int bitwiseComplement(int n) {
        int k=(1<<(int)(Math.log(n)/Math.log(2))+1)-1;
        int w=n^k;
        return w;
        
    }
}