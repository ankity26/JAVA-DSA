import java.util.Arrays;

public class Merge_two_SortedArray
{
    //    https://leetcode.com/problems/merge-sorted-array/description/
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n = 3 ;
        int m = 3 ;
        merge(nums1 , m , nums2 , n);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        /* Approach
        So nums1 will be always greater than nums2
        we will start traversing through the nums2 last position
        and we will fill the last position of nums1 with greatest element among nums1 & nums2
        we will do this for second largest element also till our nums2 arrays is empty
         */

        int i = m-1; //Point at the nums1. We are using m here becuse n of elements are zero and size of nums1 is m+n.
        int j = n-1; //Pointer at the nums2 array.
        int k = nums1.length-1; //Pointer at the last postion of the nums1 Array.

        while(j>=0)
        {
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }

            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }

}
