class Solution {
    public int reverse(int x) {
        int n=x;
        int res=0;
        if(n<0){
            n=n*-1;
        }
        while(n>0){
            int digit=n%10;
            if (res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            res=res*10+digit;
            n/=10;
        }
        if(x<0){
            res=res*-1;
        }
        return res;

        
    }
}