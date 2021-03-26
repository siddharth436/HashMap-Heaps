class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums1.length ; i++){
            Integer j = hm.get(nums1[i]);
            hm.put(nums1[i], j==null ? 1 : j+1);
        }
        System.out.print(hm);
        
        