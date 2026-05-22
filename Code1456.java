class Code1456
{
    public int maxVowels(String s, int k)
    {
        int c=0,max=0;
        for(int i=0;i<k;i++)
        {
            if("aeiou".indexOf(s.charAt(i))!=-1)
            c++;
        }
        max=c;
        for(int i=k;i<s.length();i++)
        {
            if("aeiou".indexOf(s.charAt(i))!=-1)
            c++;
            if("aeiou".indexOf(s.charAt(i-k))!=-1)
            c--;
            if(c>max)
            max=c;
        }
        return max;
    }
}