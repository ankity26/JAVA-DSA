import java.util.Scanner;

public class NthFibonaciNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));


    }

    static int fibo(int n) {
        if (n < 2) return n; //base case

        return fibo(n - 1) + fibo(n - 2); //recursive case.
    }
/*
    Steps To find recursive solution
    1--> Identify if you can break the problem into smaller part
    2--> Write the recurssion relation if needed
    3--> Draw the recursive tree.
    4--> See the flow of function how they are getting stacked
    5--> Identify flow on left tree call and right tree call
    6--> Draw recursive tree again and again using pen and paper
    7--> using the debugger pointer.

*/
}
