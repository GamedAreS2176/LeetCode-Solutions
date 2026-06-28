class Code54
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> al=new ArrayList<>();
        int l=0,r=matrix[0].length-1,t=0,b=matrix.length-1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                al.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                al.add(matrix[i][r]);
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    al.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    al.add(matrix[i][l]);
                }
                l++;
            }
        }
        return al;
    }
}