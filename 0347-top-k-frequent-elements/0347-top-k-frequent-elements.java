class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
       for(int x: map.keySet()){

    
        pq.add(x);
        if(pq.size()>k){
            pq.poll();
        }
       }
       int[] arr=new int[k];
       for(int i=k-1;i>=0;i--){
        arr[i]=pq.poll();
       }
       return arr;
        
    }
}