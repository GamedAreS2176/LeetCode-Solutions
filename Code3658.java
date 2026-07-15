class Code3658
{
    public int gcdOfOddEvenSums(int n)
    {
        int oc=0,ec=0,sumOdd=0,sumEven=0;
        while(oc<n && ec<n)
        {
            sumOdd+=2*oc+1;
            sumEven+=2*ec+2;
            oc++;
            ec++;
        }
        return gcd(sumOdd,sumEven);
    }
    int gcd(int x,int y)
    {
        while(y!=0)
        {
            int t=y;
            y=x%y;
            x=t;
        }
        return Math.abs(x);
    }
}