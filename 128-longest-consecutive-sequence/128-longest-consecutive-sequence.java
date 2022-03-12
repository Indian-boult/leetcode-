class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(IntStream.of(nums).boxed().collect(Collectors.toList()));
        int count = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int y = num+1;
                while(set.contains(y)){
                    y++;
                }
                count = Math.max(count, y - num);
            }
        }
        return count;
    }
}