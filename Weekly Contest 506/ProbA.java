class ProbA
{
    public boolean checkGoodInteger(int n)
    {
        int s=0,s2=0;
        while(n>0)
            {
                s+=n%10;
                s2+=(n%10)*(n%10);
                n/=10;
            }
        return s2-s>=50;
    }
}