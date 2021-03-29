class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < arr.length ; i++){
            int m = arr[i]%k;
            if(m<0){
                m+=k;
            }
            int of = hm.getOrDefault(m,0);
           hm.put(m,of+1);
           
        }
        for(int i : arr){
            int rem = i%k;
            if(rem<0){
                rem+=k;
            }
            if(rem==0){
                int freq = hm.get(rem);
                if(freq%2==1){
                      return false;
                    }
                }
            else if(2*rem==k){
                int freq = hm.get(rem);
                if(freq%2==1){
                      return false;
                    }
            }
            else{
                int freq = hm.get(rem);
                int ofeq = hm.getOrDefault(Math.abs(k-rem),0);
                if(freq!=ofeq){
                    return false;
                }
            }
        }
        return true;
                
   }
}