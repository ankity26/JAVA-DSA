import java.util.Arrays;

public class SelectionSort
{
    //Selection sort algorithm
    //Time Complexity --> O(n^2)
    //Space Complexity --> O(1)
    public static void main(String[] args) {

        int[] new_arr = {64,25,12,22,11};
        SortedBySelectionSort(new_arr);
        System.out.println(Arrays.toString(new_arr));

    }


    //For the first postion arrays is traversed sequentialy from 0 to n-1-->size of array;
    static void SortedBySelectionSort(int[] new_arr)
    {
        int n = new_arr.length;

        for(int i = 0; i < n-1; i++)
        {

            int min_idx = i;  //our minimum for now will be at indx i if we found another min number we will change our min_indx
            for(int j = i+1; j < n; j++)
            {
                if(new_arr[j] < new_arr[min_idx])
                {
                    min_idx = j; //it changes min_idx to j now.
                }

                //swapping of elements from maximum to minimum
                //we are bringing the min element to the front of the array.
                int temp = new_arr[min_idx];  //here temp will be 25 as j-->1 this will be 11 after all the itereation for second loop
                new_arr[min_idx] = new_arr[i]; //here we change the position of element which is at our min_idx to element which is at position i == 0.
                new_arr[i] = temp; //now at position i our temp which is 25 is placed.

            }

        }

    }
}
