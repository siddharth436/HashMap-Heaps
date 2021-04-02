package hashMap;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {
	public static void main(String[] args) {
		String m = "ddacbbaccdedacebb";
		int k = 2;
		HashMap<Character,Integer> hm = new HashMap<>();
		int i = -1;
		int j = -1;
		int answer = 0;
		while(true) {
			boolean f1 = false;
			boolean f2 = false;
			while(i<m.length()-1) {
				f1 = true;
				i++;
				char ch = m.charAt(i);
				hm.put(ch,hm.getOrDefault(ch, 0)+1);
				if(hm.size()<=k) {
					int length = i-j;
					if(length>answer)
						answer = length;
				}
				else {
					break;
				}
					
					
			}
			while(j<i) {
				f2 = true;
				j++;
				char ch = m.charAt(j);
				if(hm.get(ch)==1)
					hm.remove(ch);
				else {
					hm.put(ch,hm.get(ch)-1);
				}
				if(hm.size()>k)
					continue;
				else {
					int length = i-j;
					if(length>answer)
						answer = length;
				}
				break;
					
			}
			if(f1==false && f2==false)
				break;
			
		}
		System.out.print(answer);
	}
}
