import java.util.*;
public class LeetcodeFourFourEight
{
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    //same as leetcode 268 uses cyclic sort
    //we just need to return index of the missing elements
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));


    }
    static List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> res = new ArrayList<Integer>();

        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[correct] != nums[i])
            {
                swap(nums , i , correct);
            }
            else i++;

        }

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                res.add(j+1);
            }
        }

        return res;

    }
    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

