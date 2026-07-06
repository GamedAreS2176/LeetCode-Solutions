class Code1288
{
    public int removeCoveredIntervals(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int c=0,prev=Integer.MIN_VALUE;
        for(int i[]:intervals)
        {
            if(i[1]>prev)
            {
                c++;
                prev=i[1];
            }
        }
        return c;
    }
}