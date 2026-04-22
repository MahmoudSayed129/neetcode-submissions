class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0)
            return "|";
        String str = "";
        String len = "";
        for(String s : strs)
        {
            len += s.length() + ",";
            str+=s; 
        }
        if(len.length()>0)
            len = len.substring(0,len.length()-1);
        return len + "|" + str; 

    }

    public List<String> decode(String str) {
        if(str == "|")
            return new ArrayList<>();
        int mid = str.indexOf("|");
        String strings = str.substring(mid+1,str.length());
        String len = str.substring(0,mid);
        String [] lenArray = len.split(",");
        int i = 0;
        List<String> list = new ArrayList<>();
        for(String lenE : lenArray)
        {
            int length = Integer.parseInt(lenE);
            list.add(strings.substring(i,i+length));
            i+=length;
        } 
        return list;
    }
}
