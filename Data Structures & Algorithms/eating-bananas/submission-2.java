class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            long hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // same as ceil(pile / mid)
            }

            if (hours <= h) {
                right = mid;   // try smaller speed
            } else {
                left = mid + 1; // need bigger speed
            }
        }

        return left;
    }
}