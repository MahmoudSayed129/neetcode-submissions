class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end)
        {
            if(end - start == 1)
                return Math.min(nums[start],nums[end]);
            int mid = (end + start) / 2;
            if(nums[mid] > nums[end])
                start = mid; 
            else
                end = mid;
        }
        return nums[end];
    }
}
