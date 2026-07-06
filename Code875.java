class Code875
{
    public int minEatingSpeed(int[] piles,int h)
    {
        int max=0;
        for(int i:piles)
        {
            if(i>max)
            max=i;
        }
        int low=1,high=max,sol=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long tot=calcTotalHours(piles,mid);
            if(tot<=h)
            {
                sol=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return sol;
    }
    public long calcTotalHours(int[] piles,int mid)
    {
        long tot=0;
        for(int i:piles)
        {
            tot+=(i+mid-1)/mid;
        }
        return tot;
    }
}