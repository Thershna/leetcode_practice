class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        int width;
        int height1;
        int area;
        while(left<right){
            width=right-left;
            height1=Math.min(height[left],height[right]);
            area=width*height1;
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return maxarea;
        
    }
}