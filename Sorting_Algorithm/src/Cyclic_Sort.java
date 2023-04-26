import java.util.Arrays;

public class Cyclic_Sort
{
    //Cyclic Sort
    //It is use for continous array of range 1 to n;

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr)
    {
        int start_index = 0; //index starting from zero , as index will start form zero
        while(start_index < arr.length) //and it will run till we checked all the elements || till or start index is => arr.length
        {
            int correct_index = arr[start_index] - 1;  //In sorted array value of element is equal to index value-1 bcoz arrays stars from zero.
            if(arr[start_index] != arr[correct_index]) //if our element at start index is not = array at correct index then swap
            {
                Swap(arr , start_index , correct_index);
            }
            else //else increment start_index.
            {
                start_index++;
            }
        }

    }

    static void Swap(int[] arr ,  int first , int  second )
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
