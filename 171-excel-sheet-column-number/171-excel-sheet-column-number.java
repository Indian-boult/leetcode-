class Solution {
    public int titleToNumber(String columnTitle) {
        char[] ch = columnTitle.toCharArray();
        int len = ch.length;
        
        int columnNumber = 0;
        for(int i=0; i<len; i++) {
            columnNumber = columnNumber*26 + (ch[i]%'A'+1);
        }
        
        return columnNumber;
    }
}