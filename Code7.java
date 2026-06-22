class Code7
{
    public int reverse(int x)
    {
        long rev=0;
        int m=Math.abs(x);
        while(m>0)
        {
            rev=rev*10+m%10;
            m/=10;
        }
        if(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE)
        return 0;
        return x<0?-(int)rev:(int)rev;
    }
}