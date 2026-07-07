class Code3754
{
    public long sumAndMultiply(int n)
    {
        int x=n,s=0,rev=0;
        while(x>0)
        {
            if(x%10>0)
            {
                s+=x%10;
                rev=rev*10+x%10;
            }
            x/=10;
        }
        x=rev;
        rev=0;
        while(x>0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return (long)rev*s;
    }
}