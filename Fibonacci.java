public class Fibonacci {

    public static int fibonacciRecursion(int n)
    {
     if(n<=1) return n;
     return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);

    }
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int n = 10;
        //System.out.print("Fibonacci Series : "+num1 +", "+num2);
        for (int i =2 ;i< n ; i++)
        {
            int num3 = num2 + num1 ;
           // System.out.print(", "+ (num3 = num2 + num1));
            num1 = num2;
            num2=num3;
        }
        for(int i=0; i<n;i++)
        System.out.println(fibonacciRecursion(i)+" ");
    }
}

/*
using Binet formula
usinj java 8
import java.util.stream.Stream;

public class Fibonacci {
    public static void fibonacciStream(int n) {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
              .limit(n)
              .map(t -> t[0])
              .forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci numbers to generate
        System.out.print("Fibonacci Sequence: ");
        fibonacciStream(n);
    }
}

 */