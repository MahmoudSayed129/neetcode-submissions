class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() <= 1)
            return s.length();
        int maxS = 0;
        int re = 1;
        int j = 0;
        int temp = k;
        for (int i = 1; i < s.length(); i ++)
        {
            if(s.charAt(j) == s.charAt(i))
                re++;
            else 
            {
                int start = i;
                for(; temp >= 0 && start < s.length(); start++)
                {
                    if(s.charAt(j) == s.charAt(start))
                        re++;
                    else if (temp > 0)
                    {
                        temp--;
                        re++;
                    }
                    else 
                        temp--;       
                }
                if(temp>0)
                    re += Math.min(temp, j);
                temp = 0;
                maxS = Math.max(re,maxS);
                re=1;
                j=i;
            }
            System.out.println(temp + "   " + maxS+ " " + j + "  " + re + "  " + i);
            if(temp>0 && i == s.length()-1)
                re += Math.min(temp, j);
            System.out.println(temp + "   " + maxS+ " " + j + "  " + re + "  " + i);
            temp = k;
            maxS = Math.max(re,maxS);
        }
        return maxS;
    }
}
