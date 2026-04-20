class Solution {
    public boolean isAnagram(String s, String t) {
        Map <String, Integer> map = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)+""))
                map.put(s.charAt(i)+"", map.get(s.charAt(i)+"") +1);
            else
                map.put(s.charAt(i)+"",1);
        }
        for (int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i)+"") || map.get(t.charAt(i)+"")==0)
                return false;
            else
                map.put(t.charAt(i)+"", map.get(t.charAt(i)+"") -1);
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<List<String>>();
        for(int i=0; i<strs.length;i++){
            List<String> temp = new ArrayList<String>();
            if(strs[i] == null)
                continue;
            temp.add(strs[i]);
            for(int j = i + 1 ; j < strs.length; j++){
                if(strs[j] != null && isAnagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    strs[j] = null;
                }
            }
            output.add(temp);
        }

        return output;
    }
}
