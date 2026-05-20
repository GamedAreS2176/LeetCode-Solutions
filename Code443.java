class Code443
{
    public int compress(char[] chars)
    {
        int i=0,r=0;
        while(i<chars.length)
        {
            int len=1;
            while(i+len<chars.length && chars[i+len]==chars[i])
            {
                len++;
            }
            chars[r++]=chars[i];
            if(len>1)
            {
                for(char ch:Integer.toString(len).toCharArray())
                {
                    chars[r++]=ch;
                }
            }
            i+=len;
        }
        return r;
    }
}