class Code1833
{
    public int maxIceCream(int[] costs, int coins)
    {
        Arrays.sort(costs);
        int i=0;
        while(coins>0 && i<costs.length)
        {
            if(coins<costs[i])
            break;
            coins-=costs[i];
            i++;
        }
        return i;
    }
}