class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int min=prices[0];
        int maxp=0;
        
        
        for(int i=1;i<len;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            if(maxp<profit){
                maxp=profit;
            }
        }
        return maxp;
    }
}