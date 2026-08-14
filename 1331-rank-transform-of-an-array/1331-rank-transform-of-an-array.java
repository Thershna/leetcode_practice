class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] narr=arr.clone();
        Arrays.sort(narr);
        int len=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        int[] result=new int[len];
        for(int i=0;i<len;i++){
            if(!map.containsKey(narr[i])){
                map.put(narr[i],rank);
                rank++;
            }
        }
        for(int i=0;i<len;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
        
    }
}