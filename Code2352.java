import java.util.*;
class Code2352
{
    public int equalPairs(int[][] grid)
    {
        int count=0;
        HashMap<List<Integer>,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                r.add(grid[i][j]);
            }
            hm.put(r,hm.getOrDefault(r,0)+1);
        }
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> c=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
            {
                c.add(grid[j][i]);
            }
            count+=hm.getOrDefault(c,0);
        }
        return count;
    }
}