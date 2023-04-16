import java.util.Arrays;

public class TwoD_Array_Search
{
    public static void main(String[] args)
    //How to search in 2-D array using binary search
    {
        int[][] nums = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(nums , 49)));


    }

    static int[] search(int[][] arr , int target)
    {
        int row = 0; // we start from the first row who's index is zero         //{10,20,30,40},
                                                                                //{15,25,35,45},
                                                                               // {28,29,37,49},
                                                                               // {33,34,38,50}
        int col = arr[0].length-1;      //And we start  from last column.
        // so we start element 40.

        while(row < arr.length && col >= 0)
        {
            if(arr[row][col] == target) { // here we check if 40 is equal to target if yes return row and col of the element
                return new int[]{row , col};
            }

            if(arr[row][col] < target) { // here we check if our target is greater than 40 if yes we increase our row be
                //because our matrix is sorted in Ascending order and if we our target is greater than current element it will lie below
                row++;
            }
            else{  //if not we or target is less than the current element which is 40 we decrement our column becuse we
                //need to check before 40 and element in col 40 which greater than our target becuase our array is sorted.
                col--;
            }
        }

        return new int[]{-1 , -1};  // if nothing is found return this -1 -1.
    }
}
