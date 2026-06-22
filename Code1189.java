class Code1189
{
    public int maxNumberOfBalloons(String text)
    {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<text.length();i++)
        {
            hm.put(text.charAt(i),hm.getOrDefault(text.charAt(i),0)+1);
        }
        int arr[]=new int[5];
        int i=0;
        for(Map.Entry<Character,Integer> e:hm.entrySet())
        {
            if(e.getKey()=='b'||e.getKey()=='a'||e.getKey()=='n')
            {
                arr[i]=e.getValue();
                i++;
            }
            else if(e.getKey()=='l'||e.getKey()=='o')
            {
                arr[i]=e.getValue()/2;
                i++;
            }
        }
        int min=arr[0];
        for(int k=1;k<arr.length;k++)
        {
            min=Math.min(min,arr[k]);
        }
        return min;
    }
}