class Code134
{
    public int canCompleteCircuit(int[] gas,int[] cost)
    {
        int tank=0,start=0,tbal=0;
        for(int i=0;i<gas.length;i++)
        {
            tank+=gas[i]-cost[i];
            tbal+=gas[i]-cost[i];
            if(tank<0)
            {
                start=i+1;
                tank=0;
            }
        }
        return tbal>=0?start:-1;
    }
}