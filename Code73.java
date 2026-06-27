class Code73
{
    public void setZeroes(int[][] matrix)
    {
        boolean zero1[]=new boolean[matrix.length];
        boolean zero2[]=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    zero1[i]=true;
                    zero2[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(zero1[i]||zero2[j])
                matrix[i][j]=0;
            }
        }
    }
}