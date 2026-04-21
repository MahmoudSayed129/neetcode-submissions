class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(j));
            if (!((s.charAt(i) >= 'a' &&  s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' &&  s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' &&  s.charAt(i) <= '9')))
                i++;
            else if (!((s.charAt(j) >= 'a' &&  s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' &&  s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' &&  s.charAt(j) <= '9')))
                j--;
            else 
            {
                if(!(s.charAt(j) + "").equalsIgnoreCase(s.charAt(i)+""))
                    return false;
                i++;
                j--;
            }
            
        }
        return true;
    }
}
