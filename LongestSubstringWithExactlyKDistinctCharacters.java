package hashMap;

import java.util.HashMap;

public class LongestSubstringWithExactlyKDistinctCharacters {
	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<>();
		String m = "aabcbcdbca";
		int k = 2;
		int i = -1;
		int j = -1;
		int max = Integer.MIN_VALUE;
		while(true) {
			boolean f1 = false;
			boolean f2 = false;
			while(i< m.length()-1) {
				f1=true;
				i++;
				char ch = m.charAt(i);
				hm.put(ch,hm.getOrDefault(ch,0)+1);
				if(hm.size()==k) {
					int length = i-j;
					if(length>max)
						max = length;
				}
				else if(hm.size()>k)
					break;
			}
			while(j<i) {
				f2 = true;
				j++;
				char ch = m.charAt(j);
				if(hm.get(ch)==1)
					hm.remove(ch);
				else
					hm.put(ch, hm.get(ch)-1);
				if(hm.size()==k) {
					int length = i-j;
					if(length>max)
						max = length;
					break;
					}
					
				
				}
			if(f1==false && f2==false)
				break;
			
			
			}
		System.out.println(max);
			
		}
		
		

}

