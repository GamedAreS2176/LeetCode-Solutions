class Code1291
{
    public List<Integer> sequentialDigits(int low, int high)
    {
        String str="123456789";
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                int num=Integer.parseInt(str.substring(i,j));
                if(num>=low && num<=high)
                al.add(num);
            }
        }
        al.sort(null);
        return al;
    }
}