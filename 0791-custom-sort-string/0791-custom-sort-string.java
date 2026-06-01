class Solution {
    public String customSortString(String order, String s) {

        StringBuilder ans = new StringBuilder();

        char[] o1 = order.toCharArray();
        char[] s1 = s.toCharArray();

        for(int i = 0; i < o1.length; i++) {
            for(int j = 0; j < s1.length; j++) {
                if(o1[i] == s1[j]) {
                    ans.append(o1[i]);
                }
            }
        }

        for(int i = 0; i < s1.length; i++) {

            boolean found = false;

            for(int j = 0; j < o1.length; j++) {
                if(s1[i] == o1[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                ans.append(s1[i]);
            }
        }

        return ans.toString();
    }
}