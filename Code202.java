class Code202
{
    public boolean isHappy(int n)
    {
        while(n!=1 && n!=4)
        {
            n=doTheThing(n);
        }
        return n==1;
    }
    int doTheThing(int x)
    {
        int s=0;
        while(x>0)
        {
            s+=(x%10)*(x%10);
            x/=10;
        }
        return s;
    }
}