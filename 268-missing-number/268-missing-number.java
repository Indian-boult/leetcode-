class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int curr = 0;
        for(int num: nums){
            curr = curr^num;
        }
        for(int i=0;i<=n;i++){
            curr = curr^i;
        }
        return curr;
    }
}