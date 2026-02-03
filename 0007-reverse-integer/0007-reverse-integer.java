class Solution {
    public int reverse(int x) {
        int n=x;
        int num=0;
        if(x<0){
            n=n*-1;
        }
        while(n>0){
            int digit=n%10;
            if (num > Integer.MAX_VALUE / 10) {
                return 0;
            }
            num=num*10+digit;
            n/=10;
        }
        if(x<0){
            num=num*-1;
        }
        return num;
        
    }
}