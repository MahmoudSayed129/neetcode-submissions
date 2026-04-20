class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);
        }
        List<Integer> [] bucket = new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(bucket[entry.getValue()]);
                if(bucket[entry.getValue()] != null)
                    bucket[entry.getValue()].add(entry.getKey());
                else
                {
                    bucket[entry.getValue()] = new ArrayList<>();
                    bucket[entry.getValue()].add(entry.getKey());
                }
                System.out.println(bucket[entry.getValue()]);
            }
        List<Integer> out = new ArrayList<Integer>();
        for (int i = nums.length ; i > 0 && k>0; i --){
            System.out.println("---a---");
            System.out.println(bucket[i]);
            if(bucket[i] != null){
                out.addAll(bucket[i]);
                k = k - bucket[i].size();
            }
        }
        int[] result = new int[out.size()];
        for (int i = 0; i < out.size(); i++) {
            result[i] = out.get(i);
        }

        return result;
    }
}
