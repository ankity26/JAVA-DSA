import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

//        To recurssion we are passing our array start point and end point.
        Bubble(arr ,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[]arr, int end , int start)
    {
        if(end == 0){
//            Base conditon
            return;
        }

        if(start < end) {
            if (arr[start] > arr[start + 1]) {
//                if element at index 0 > 1 then swap
                //swap
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
//            after swap we move ahead with index0+1
            Bubble(arr , end , start+1);
        }
        else{
//            if we don't swap it mean our element is at correct positon and we don't need to move ahead so we move our end pointer
            Bubble(arr , end-1 , 0);
        }


    }
}
