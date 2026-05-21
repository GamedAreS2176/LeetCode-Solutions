class Code11
{
    public int maxArea(int[] height)
    {
        int p1=0,p2=height.length-1,max=0;
        while(p1<p2)
        {
            int len=p2-p1;
            int brd=Math.min(height[p1],height[p2]);
            if(len*brd>max)
            max=len*brd;
            if(height[p1]>height[p2])
            p2--;
            else
            p1++;
        }
        return max;
    }
}