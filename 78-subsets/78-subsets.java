class Solution {
    public void findCorrespondingSubset(List<List<Integer>> result, int i, int[] nums){
        List<Integer> currentList = new ArrayList<>();
        int j=0;
        if(i == 0){
            result.add(Collections.emptyList());
            return;
        }
        else{
            while(i>0){
                if((i&1) == 1)
                    currentList.add(nums[j]);
                j++;
                i = i>>1;
            }
            result.add(currentList);
        }
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<Math.pow(2, nums.length);i++){
            findCorrespondingSubset(result, i, nums);
        }
        return result;
    }
}