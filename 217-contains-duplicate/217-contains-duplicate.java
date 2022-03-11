class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(count.containsKey(num))
                return true;
            count.put(num, 1);
        }
        return false;
    }
}