class Solution {
    public void convert(int[][] matrix, int i, int j){
        for(int col = 0; col<matrix[0].length;col++){
            if(matrix[i][col] != 0){
                matrix[i][col] = Integer.MIN_VALUE+1;
            }
        }
        for(int row = 0; row<matrix.length;row++){
            if(matrix[row][j] != 0){
                matrix[row][j] = Integer.MIN_VALUE+1;
            }
        }   
    }
    
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    convert(matrix, i, j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == Integer.MIN_VALUE+1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}