import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner number;
        number = new Scanner(System.in);
        int fibonaccis;
        System.out.println("Enter the nth term you want to see : ");
        fibonaccis = number.nextInt();

        int num1 = 0, num2 = 1, num3;
            int fiboseq = Fibo(fibonaccis);
            System.out.println(fiboseq);
        System.out.print("The fibonacci sequence " + fibonaccis + " numbers  is : " + num1 + " " + num2);
        for (int j = 2; j < fibonaccis; j++) {

            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;

        }

    }       public static int Fibo( int fibonacci){

            int[] InputArray = new int[fibonacci];
            for (int i = 0; i < fibonacci; ++i) {
                int n1 = 0, n2 = 1, n3;

                System.out.println("The " + fibonacci + "th term is :");
                for (i = 2; i < fibonacci; ++i) {
                    n3 = n1 + n2;

                    InputArray = new int[fibonacci];
                    InputArray[i] = n3;
                    n1 = n2;
                    n2 = n3;

                }

            }
            return InputArray[fibonacci - 1];


    }
}
