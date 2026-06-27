class Code48
{
    public void rotate(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int l=0,r=matrix[i].length-1;
            while(l<r)
            {
                int t=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=t;
                l++;
                r--;
            }
        }
    }
}