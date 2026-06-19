class Code290
{
    public boolean wordPattern(String pattern, String s)
    {
        String words[]=s.split(" ");
        if(pattern.length()!=words.length)
        return false;
        HashMap<Character,String> hm1=new HashMap<>();
        HashMap<String,Character> hm2=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            if(hm1.containsKey(pattern.charAt(i)))
            {
                if(!hm1.get(pattern.charAt(i)).equals(words[i]))
                return false;
            }
            else
            hm1.put(pattern.charAt(i),words[i]);

            if(hm2.containsKey(words[i]))
            {
                if(hm2.get(words[i])!=pattern.charAt(i))
                return false;
            }
            else
            hm2.put(words[i],pattern.charAt(i));
        }
        return true;
    }
}