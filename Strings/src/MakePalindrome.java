public class MakePalindrome
{
    //https://leetcode.com/problems/split-two-strings-to-make-palindrome/description/
    public static void main(String[] args) {
        String a ="ulacfd";
        String b ="jizalu";

        boolean answer =  check(a , b) || check(b , a);
        System.out.println(answer);
            /*
                  This is the most important part of question as here we check if any of given string is palindrome
                  or contains palindrome.
                  TO return true both the function must return true it mean both of the string must contain substring which is
                  palindrome in nature if any of the string does not contain palindrome means we have to return false

                   check(a , b) works as A-Prefix + B-Suffix
                   Check(b , a) works as B-prefix + A-suffix

            */
    }



    static boolean check(String a , String b){
        /*
        Here we check if String a or String b and there substring are palindrome or not using our isPalindrome function.
        we have two pointer i and j one points at start and other at end and we check substring between i and j
        is palindrome or not.
        */

        int i = 0;
        int j = a.length()-1;
        while(i < j)
        {
            if(a.charAt(i) != b.charAt(j))
            {
                return isPalindrome(a , i , j) || isPalindrome(b , i , j);
            }
            i++;
            j--;
        }

        return true;
    }

    static boolean isPalindrome(String s , int i , int j)
    {
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
