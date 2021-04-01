package hashMap;

import java.util.*;

public class CountOfEquivalentSubarrays {
	public static void main(String[] args) {
		int arr[] = {2,5,3,5,2,4,1,3,1,4};
		HashSet<Integer> hs = new HashSet<>();
		int answer=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i : arr)
			hs.add(i);
		int x = hs.size();
		int i = -1;
		int j = -1;
		while(true) {
			boolean f1= false;
			boolean f2=false;
			while(i<arr.length-1) {
				f1=true;
				i++;
				hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
				if(hm.size()==x) {
					answer+= arr.length-i;
					break;
				}
			}
			while(j<i) {
				f2=true;
				j++;
				if(hm.get(arr[j])==1) {
					hm.remove(arr[j]);
				}
				else {
					int val = hm.get(arr[j]);
					hm.put(arr[j], val-1);
				}
				if(hm.size()==x) {
					answer+=arr.length-i;
				}
				else {
					break;
				}
			}
			if(f1==false && f2==false)
				break;
		
			
		}
		System.out.print(answer);
		
		
		
	}

}
