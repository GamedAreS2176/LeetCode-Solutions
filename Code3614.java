class Code3614
{
    public char processStr(String s, long k)
    {
        long l=0;
        for(char ch:s.toCharArray())
        {
            switch(ch)
            {
                case '*':
                    if(l>0)
                    l--;
                    break;
                case '#':
                    l*=2;
                    break;
                case '%':
                    break;
                default:
                    l++;
                    break;
            }
        }
        if(k>l-1)
        return '.';
        for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case '*':
                    l++;
                    break;
                case '#':
                    l/=2;
                    if(k>=l)
                    k-=l;
                    break;
                case '%':
                    k=l-k-1;
                    break;
                default:
                    if(k==l-1)
                    return s.charAt(i);
                    l--;
                    break;
            }
        }
        return '.';
    }
}