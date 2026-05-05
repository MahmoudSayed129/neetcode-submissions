class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (end + start) / 2 ;
        while(end >= start)
        {
            System.out.println(end + " " + start + " " + mid);
            System.out.println(target + " " + nums[mid]);
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
            mid = (end + start) / 2 ;
        }
        return -1;
    }
}
