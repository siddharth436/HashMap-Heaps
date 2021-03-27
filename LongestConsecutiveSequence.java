class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
        for(int i : nums)
            hm.put(i,true);
        for(int i : nums){
            if(hm.containsKey(i-1)){
                hm.put(i,false);
            }
        }
       
        int max=0;
        int count=0;
        for(int i : nums){
            if(hm.get(i)==true){
                int ts=1;
                int tsp = i;
                while(hm.containsKey(tsp+ts)){
                    ts++;
                }
                if(ts>max)
                    max = ts;
            }
        }
       
        return max;
        
        
    }
}