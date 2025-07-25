class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagram_idx=new ArrayList<>();
        int[] freqP=new int[26];
        int[] freqS=new int[26];

        for(char c:p.toCharArray()){
            freqP[c-'a']++;
        }
        int left=0;
        for(int right=0;right<s.length();right++){
           char ch=s.charAt(right);
           int idx=ch-'a';
           freqS[idx]++;
           
           if(right-left+1>p.length()){
            freqS[s.charAt(left)-'a']--;
            left++;
           }

           if(right-left+1==p.length()){
            if(Arrays.equals(freqP,freqS)){
                anagram_idx.add(left);
            }
           }
        }
        return anagram_idx;
    }
}