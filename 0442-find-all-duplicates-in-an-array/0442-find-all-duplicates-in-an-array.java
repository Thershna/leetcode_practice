class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=1){
                list.add(entry.getKey());
            }
        }
        return list;
        
        
    }
}