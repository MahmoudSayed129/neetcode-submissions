class Solution {
    public int trap(int[] height) {
        if (height.length < 2)
            return 0;

        int start = 0;
        int end = 1;
        int maxidx = 0;
        int maxH = 0;
        int sum = 0;
        int sumTillMax = 0;
        int sumWindow = 0;

        while (end < height.length) {
            if (height[end] >= height[start]) {
                sum += sumWindow;

                start = end;
                end = start + 1;

                maxidx = 0;
                maxH = 0;
                sumTillMax = 0;
                sumWindow = 0;
            } else {
                sumWindow += height[start] - height[end];

                if (height[end] >= maxH) {
                    maxH = height[end];
                    sumTillMax = sumWindow;
                    maxidx = end;
                }

                if (end == height.length - 1) {
                    if (maxidx == 0)
                        break;

                    sum += sumTillMax - (maxidx - start) * (height[start] - maxH);

                    start = maxidx;
                    end = start + 1;

                    maxidx = 0;
                    maxH = 0;
                    sumTillMax = 0;
                    sumWindow = 0;
                } else {
                    end++;
                }
            }
        }

        return sum;
    }
}