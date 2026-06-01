class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int la1 = arr1.length;
        int la2 = arr2.length;
        int k = 0;
        int[] newarr = new int[la1];
        for (int i = 0; i < la2; i++) {
            for (int j = 0; j < la1; j++) {
                if (arr2[i] == arr1[j]) {
                    newarr[k++] = arr1[j];
                }

            }
        }
        ArrayList<Integer> extra=new ArrayList<>();
        
        for(int i=0;i<la1;i++){
            boolean found=false;
            for(int j=0;j<la2;j++){
                if(arr1[i]==arr2[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                extra.add(arr1[i]);
            }

        }
        Collections.sort(extra);
        for(int n:extra){
            newarr[k++]=n;
        }
        return newarr;

    }
}