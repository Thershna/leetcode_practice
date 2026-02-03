class Solution {
    public int subtractProductAndSum(int n) {
        int x=n;
        int prod=1;
        int sum=0;
        while(x>0){
            int digit=x%10;
            prod*=digit;
            sum+=digit;
            x/=10;
        }
        int result=prod-sum;
        return result;
        
    }
}