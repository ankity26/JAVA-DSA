public class FunctionCalls
{
    public static void main(String[] args) {
        //Write a program to print numbers 1 to 5
        print(1);
    }

    static void print(int n)
    {
        System.out.println(n);
        print1(2);
    }
    static void print1(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print2(int n)
    {
        System.out.println(n);
        print4(3);
    }
    static void print3(int n)
    {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n)
    {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n)
    {
        System.out.println(n);
    }

}
