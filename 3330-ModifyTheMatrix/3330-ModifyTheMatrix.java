// Last updated: 9/2/2026, 10:20:16 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max;
        int[] col=new int[matrix[0].length];
        for(int j=0;j<col.length;j++)
        {
            max=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            col[j]=max;
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=col[j];
                }
            }
        }
        return matrix;
    }
}