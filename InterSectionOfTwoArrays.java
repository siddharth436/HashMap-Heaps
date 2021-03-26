class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums1.length ; i++){
            Integer j = hm.get(nums1[i]);
            hm.put(nums1[i], j==null ? 1 : j+1);
        }
        System.out.print(hm);
        
        for(int i = 0 ; i < nums2.length ; i++){
            if(hm.containsKey(nums2[i])){
                al.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }
        int arr[] = new int[al.size()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = al.get(i);
        }
       return arr;
        
    }
}