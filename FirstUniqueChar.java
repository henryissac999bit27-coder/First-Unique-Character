class Solution {
    public int firstUniqChar(String s) {
        for (int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            if (s.indexOf(s1)==s.lastIndexOf(s1)){
                return i;
            }
        }
        return -1;
    }
}