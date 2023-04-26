import java.util.Arrays;

public class Insertion_sort
{

    //Insertion Sort
    //TimeComplexity = O(n) Best case || O(n^2)
    public static void main(String[] args)
    {
        int[] arr = {64,25,12,22,11};
        sortedByInstertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortedByInstertionSort(int [] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n-1; i++)
        {
            int value = arr[i];
            int hole = i; //hole is i+1 which is element at right side of sorted array.

            while(hole > 0 && arr[hole-1] > value)
            {
                arr[hole] = arr[hole-1]; //we compare the element at the hole and our value, and we replace it by element at hole
                hole = hole-1;
            }
            arr[hole] = value;


        }

    }

}
