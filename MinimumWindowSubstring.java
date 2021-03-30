class Solution {
    public String minWindow(String s, String t) {
        String answer="";
        HashMap<Character,Integer> pattern = new HashMap<>();
        for(char c : t.toCharArray()){
            pattern.put(c, pattern.getOrDefault(c,0)+1);
        }
        int matchcount = 0;
        int desiredMatchCount = t.length();
        System.out.println(pattern);
        HashMap<Character,Integer> original = new HashMap<>();
        int i = -1;
        int j = -1;
        while(true){
            boolean flag1 = false;
            boolean flag2 = false;
            while(i<s.length()-1 && matchcount<desiredMatchCount){
                i++;
                char ch = s.charAt(i);
                original.put(ch, original.getOrDefault(ch,0)+1);
                if(original.getOrDefault(ch,0)<=pattern.getOrDefault(ch,0)){
                    matchcount++;
                }
                flag1 = true;
            }
            while(j<i && matchcount==desiredMatchCount){
                String potential_answer = s.substring(j+1,i+1);
                if(answer.length()==0 || potential_answer.length()<answer.length()){
                    answer = potential_answer;
                }
                j++;
                char ch = s.charAt(j);
                if(original.get(ch)==1){
                    original.remove(ch);
                }
                else{
                    original.put(ch,original.get(ch)-1);
                }
                if(original.getOrDefault(ch,0) < pattern.getOrDefault(ch,0)){
                    matchcount--;
                }
                flag2 = true;
            }
            if(flag1==false && flag2==false)
                break;
            
        }
        return answer;
        
    }
}