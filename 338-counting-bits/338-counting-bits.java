class Solution {
    public static int count(int a){
        int count = 0;
        while(a > 0){
            if(a%2 == 1)
                count++;
            a /= 2;
        }
        return count;
    }
    
    public int[] countBits(int n) {
        int[] countList = new int[n+1];
        for(int i=0;i<=n;i++){
            countList[i] = count(i);
        }
        return countList;
    }
}