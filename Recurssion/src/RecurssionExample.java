public class RecurssionExample
{
    public static void main(String[] args) {
        //now the previous question using recurssion
        printNumber(1);

    }

    static void printNumber(int n)
    {
        if(n == 5){
            System.out.println(n);  //base case to prevent stack overflow
            return;
        }

        System.out.println(n);
        printNumber(n+1);  // In recurssion we call the same function again using different argument
        //when it will hit the base case function will return.
    }
//    NOTE
//    Base cases are important to prevent stack overflow if we don't have base case our function will run for infinite time till stackoverflow  happens
//    In recursion separate memory in stack is allocated to each function call.
}
