class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        int maxo = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int nmaxo = 1;
                for(int j = i+1; set.contains(j); j++)
                    nmaxo++;
                if(nmaxo > maxo)
                    maxo = nmaxo;
            }
        }
        return maxo;
    }
}
