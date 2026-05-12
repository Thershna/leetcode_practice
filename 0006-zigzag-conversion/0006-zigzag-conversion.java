class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int currentrow=0;
        boolean goingdown=false;
        for(char c:s.toCharArray()){
            rows[currentrow].append(c);
            if(currentrow==0 || currentrow==numRows-1){
                goingdown=!goingdown;
            }
            if(goingdown){
                currentrow++;
            }
            else{
                currentrow--;
            }

        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder row:rows){
            ans.append(row);
        }
        return ans.toString();
    }
}