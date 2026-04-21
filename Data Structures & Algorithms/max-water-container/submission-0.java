class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length - 1;
        int maxA = 0;
        while(left < right)
        {
            int length = heights[right];
            if  (heights[right] > heights[left])
                length = heights[left];
            System.out.println(length + "  " + heights[right]+ "  " + heights[left]);
            int area = (right - left) * length;
            if(area > maxA)
                maxA = area;
            if  (heights[right] > heights[left])
                left++;
            else if  (heights[right] < heights[left])
                right--;
            else 
            {
                left++;
                right--;
            }
        }
    return maxA;
    }
}
