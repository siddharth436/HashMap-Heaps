package hashMap;
import java.util.*;
public class DistinctElementsInWindowsOfSizeK {
	public static void main(String[] args) {
		int arr [] = {2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6};
		int k = 4;
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int i = 0;
		while(i<=k-2) {
			hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
			i++;
		}
		i--;
		int j = -1;
		while(i<arr.length-1) {
			i++;
			hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
			al.add(hm.size());
			j++;
			int freq = hm.get(arr[j]);
			if(freq==1) {
				hm.remove(arr[j]);
			}
			else {
				hm.put(arr[j], freq-1);
			}
		}
		System.out.println(al);
	}

}
