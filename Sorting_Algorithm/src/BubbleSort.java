import java.util.Arrays;

public class BubbleSort
{
    //Sorting algorithm --> Bubble-sort
    public static void main(String[] args)
    {
        int[] arr = {3 , 1 , 5 , 4 , 2}; //given array
        //we create a function to sort the array using bubble sort
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr)
    {
        boolean swapped;  //this will check swap is happened or not if not it will break
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) { // if true we will break out of the function.
                break;
            }
        }


    }
}
