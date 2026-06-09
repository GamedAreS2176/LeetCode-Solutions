class Code14
{
    public String longestCommonPrefix(String[] strs)
    {
        String min=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].length()<min.length())
            min=strs[i];
        }
        int ind=min.length();
        while(ind>0)
        {
            int c=0;
            String str=min.substring(0,ind--);
            for(int i=0;i<strs.length;i++)
            {
                if(strs[i].startsWith(str))
                c++;
            }
            if(c==strs.length)
            return str;
        }
        return "";
    }
}