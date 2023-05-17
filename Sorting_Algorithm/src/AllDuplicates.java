import java.util.*;

public class AllDuplicates
{
    //https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public static void main(String[] args)
    {
       int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(allduplicates(nums));

    }

    static List<Integer> allduplicates(int[] nums)
    {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
            {
                res.add(index+1);
            }

            nums[index] = -nums[index];
        }

        return res;
    }

}


