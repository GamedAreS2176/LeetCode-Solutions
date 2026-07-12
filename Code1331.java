class Code1331
{
    public int[] arrayRankTransform(int[] arr)
    {
        Map<Integer,Integer> hm=new HashMap<>();
        int temp[]=new int[arr.length];
        temp=arr.clone();
        Arrays.sort(temp);
        int r=1;
        for(int i:temp)
        {
            if(!hm.containsKey(i))
            {
                hm.put(i,r);
                r++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}