class Code3867
{
    public long gcdSum(int[] nums)
    {
        int mx[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            mx[i]=max;
        }
        int pgcd[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            pgcd[i]=gcd(nums[i],mx[i]);
        }
        Arrays.sort(pgcd);
        long ans=0;
        int l=0,r=nums.length-1;
        while(l<r)
        {
            ans+=gcd(pgcd[l],pgcd[r]);
            l++;
            r--;
        }
        return ans;
    }
    int gcd(int n1,int n2)
    {
        while(n2!=0)
        {
            int t=n2;
            n2=n1%n2;
            n1=t;
        }
        return n1;
    }
}