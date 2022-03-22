class Solution {
    public char findTheDifference(String s, String t) {
        int sumT = 0;
        for(int i=0;i<t.length();i++){
            sumT += Integer.valueOf(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            sumT -= Integer.valueOf(s.charAt(i));
        }
        return (char) sumT;
    }
}