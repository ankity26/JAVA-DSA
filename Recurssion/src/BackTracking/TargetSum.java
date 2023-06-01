package BackTracking;

public class TargetSum {

   static long MOD = 1_000_000_007;
    public static void main(String[] args) {
        int n = 1;
        long even =(n+1)/2;
        long odd = n/2;

//       int answer =  (int)(power(5 , even) * power(4 , odd) % MOD);
       int answer = (int) ((int)5 % MOD);
        System.out.println(answer);

    }

//    x to the power n x^n
    static  long power(long x , long n) {

        if (n == 0) {
            return 1;

        }

        long temp = power(x, n / 2);

        // if n is even return(x^(n/2))^2
        if (n % 2 == 0) {
            return (temp * temp) % MOD;
        } else {
            return (x * temp * temp) % MOD;
        }

    }

}
