import java.util.*;
class Code169
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}