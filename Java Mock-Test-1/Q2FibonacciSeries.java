import java.util.Scanner;

public class Q2FibonacciSeries{

    public static void printFibonacci(int number){

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series :: " + firstTerm + " " + secondTerm);

        for(int n=3; n<=number; n++){
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms :: ");
        int number = scanner.nextInt();

        printFibonacci(number);

        scanner.close();
    }

}