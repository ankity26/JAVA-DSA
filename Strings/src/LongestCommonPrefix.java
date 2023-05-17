public class LongestCommonPrefix
{
    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestPrefix(strs));

    }

    static  String longestPrefix(String[] arr){

        String res_prefix = arr[0]; //we make first string of the array as our prefix
        for(int i = 1; i < arr.length; i++)
        {
            while(arr[i].indexOf(res_prefix) != 0) //here we check if our res_prefix is index of our current string or not if yes will return zero else -1
            {
                //basically we check if flow.is
                res_prefix = res_prefix.substring(0 , res_prefix.length()-1);
            }
        }

        return res_prefix;
    }
}
