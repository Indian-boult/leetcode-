class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length -1, curr = 0;
        while(curr <= right){
            if(nums[curr] == 0){
                swap(nums, curr, left);
                left++;
                curr++;
            }
            else if(nums[curr] == 1){
                curr++;
            }
            else{
                swap(nums, curr, right);
                right--;
            }
        }
    }
    
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}