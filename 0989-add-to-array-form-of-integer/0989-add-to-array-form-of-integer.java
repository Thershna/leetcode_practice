class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        int n=num.length-1;;
        while(0<=n || k>0){
            if(n>=0){
                k+=num[n];
                n--;

            }
            result.add(k%10);
            k/=10;
        }
        Collections.reverse(result);
        return result;
        
    }
}