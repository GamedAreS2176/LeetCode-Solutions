import java.util.*;
class Code217
{
    public boolean containsDuplicate(int[] nums)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            return true;
            hm.put(nums[i],i);
        }
        return false;
    }
}