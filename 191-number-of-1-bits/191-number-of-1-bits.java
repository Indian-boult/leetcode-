public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        long y = n & 0x00000000ffffffffL;
        while(y>0){
            if(y%2 == 1){
                count++;
            }
            y /= 2;
        }
        return count;
    }
}