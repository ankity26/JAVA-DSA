package questions;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String[] arrr = {"h","e","l","l","o"};
        reverse(arrr , 0 , arrr.length-1);
        System.out.println(Arrays.toString(arrr));
    }

    static void reverse(String[] arr , int i , int j){

//        we will be using two pointers one at the start and one at the end.
//        and then we will swap

        if(i > j){ //base case when j will cross i it will return
            return;
        }

        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr , i+1 , j-1);//for each recursive call we are passing i+1 and j--
    }
}
