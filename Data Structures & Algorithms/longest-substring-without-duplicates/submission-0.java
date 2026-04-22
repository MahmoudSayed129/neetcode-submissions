class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 1;
        int maxS = 1;
        set.add(s.charAt(0));
        while(end < s.length())
        {
            if(set.contains(s.charAt(end)))
            {
                for(int i = start; i < end; i++)
                {
                    if(s.charAt(i) == s.charAt(end))
                    {
                        start = i+1;
                        end++;
                        break;
                    }
                    else
                        set.remove(s.charAt(i));
                }

            }
            else
            {
                set.add(s.charAt(end));
                end++;
            }
            maxS = Math.max(set.size(),maxS);
        }
    return maxS;
    }
}
