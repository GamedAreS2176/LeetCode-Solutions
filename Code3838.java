class Code3838
{
    public String mapWordWeights(String[] words, int[] weights)
    {
        String str="";
        for(int i=0;i<words.length;i++)
        {
            int s=0;
            for(int j=0;j<words[i].length();j++)
            {
                s+=weights[words[i].charAt(j)-'a'];
            }
            str+=(char)('z'-(s%26));
        }
        return str;
    }
}