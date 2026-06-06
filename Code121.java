class Code121
{
    public int maxProfit(int[] prices)
    {
        int min=prices[0],p=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<min)
            min=prices[i];
            else if(prices[i]-min>p)
            p=prices[i]-min;
        }
        return p;
    }
}