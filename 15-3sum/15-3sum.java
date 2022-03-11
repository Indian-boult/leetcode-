class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        Arrays.sort(A);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0; i<A.length-2; i++) {
            if(i==0 || (i>0 && A[i] != A[i-1])) {
                int sum = 0-A[i];
                int low = i+1, high = A.length-1;
                
                while(low < high) {
                    if(A[low] + A[high] == sum) {
                        res.add(Arrays.asList(A[i], A[low], A[high]));
                        while(low<high && A[low] == A[low+1]) low++;
                        while(low<high && A[high] == A[high-1]) high --;
                        low++;
                        high--;
                    }
                    else if(A[low] + A[high] > sum) {
                        high--;
                    }
                    else {
                        low++;
                    }
                }
            }
        }
        return res;
    }
}