class Code345
{
    public String reverseVowels(String s)
    {
        int l=0,r=s.length()-1;
        char str[]=s.toCharArray();
        while(l<r)
        {
            if("AEIOUaeiou".indexOf(str[l])!=-1 && "AEIOUaeiou".indexOf(str[r])!=-1)
            {
                char t=str[l];
                str[l]=str[r];
                str[r]=t;
                l++;
                r--;
            }
            else if("AEIOUaeiou".indexOf(str[l])!=-1 && "AEIOUaeiou".indexOf(str[r])==-1)
            r--;
            else if("AEIOUaeiou".indexOf(str[l])==-1 && "AEIOUaeiou".indexOf(str[r])!=-1)
            l++;
            else
            {
                l++;
                r--;
            }
        }
        return new String(str);
    }
}