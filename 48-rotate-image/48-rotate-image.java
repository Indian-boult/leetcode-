class Solution {
    public int[] reverse(int[] arr){
        for(int i=0;i<(arr.length)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j = i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i] = reverse(matrix[i]);
        }
        
    }
}