class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charS = new HashMap<>();
        Map<Character, Integer> charT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            charS.put(s.charAt(i), charS.getOrDefault(s.charAt(i), 0) + 1);
            charT.put(t.charAt(i), charT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return charS.equals(charT);
    }
}