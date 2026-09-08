class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j = i+1; j<matrix.length; j++){
                //swap matrix[i][j] = matrx[j][i]      
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the row
        for(int row=0; row<matrix.length; row++){
            int startCol = 0;
            int endCol = matrix.length-1;

            while(startCol < endCol){
            int temp = matrix[row][startCol];
            matrix[row][startCol] = matrix[row][endCol];
            matrix[row][endCol] = temp;

            startCol++;
            endCol--;
            }
        }
    }
}