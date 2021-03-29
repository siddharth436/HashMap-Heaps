package hashMap;

import java.util.HashMap;

import geeksforgeeks.map;

public class LargestSubArrayWithZeroSum {
	public static void main(String[] args) {
		int max_length = Integer.MIN_VALUE;
		int arr [] = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int i = -1;
		int sum = 0;
		hm.put(sum,i);
		while(i<arr.length-1) {
			i++;
			sum+=arr[i];
			if(hm.containsKey(sum)==false) {
				hm.put(sum, i);
			}
			else {
				int length = i-hm.get(sum);
				max_length = Math.max(length,max_length);
			}
		}
		System.out.println(hm);
		System.out.println(max_length);
		
		
	}

}
