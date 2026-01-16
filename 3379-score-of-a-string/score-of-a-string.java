class Solution {
    public int scoreOfString(String s) {
        //Converting String to a char array
        char[] cs = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            cs[i] = s.charAt(i);
        }
        //Calculating the sum
        int sum = 0;
        for(int i = 0; i < cs.length-1; i++){
            sum+=Math.abs(cs[i] -cs[i+1]);
        }
        return sum;
    }
}