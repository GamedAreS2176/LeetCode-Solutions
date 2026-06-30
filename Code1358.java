class Code1358
{
    public int numberOfSubstrings(String s)
    {
        int idx[]={-1,-1,-1};
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            idx[s.charAt(i)-'a']=i;
            if(idx[0]!=-1 && idx[1]!=-1 && idx[2]!=-1)
            c+=Math.min(idx[0],Math.min(idx[1],idx[2]))+1;
        }
        return c;
    }
}