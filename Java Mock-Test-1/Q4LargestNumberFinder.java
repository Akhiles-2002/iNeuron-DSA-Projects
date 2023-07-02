import java.util.Scanner;

public class Q4LargestNumberFinder {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number :: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the First Number :: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the First Number :: ");
        int thirdNumber = scanner.nextInt();

        int largestNumber = 0;

        if(firstNumber > secondNumber){
            if(firstNumber > thirdNumber)
                largestNumber = firstNumber;
            else
                largestNumber = thirdNumber;                
        } else {
            if(secondNumber > thirdNumber)
                largestNumber = secondNumber;
            else
                largestNumber = thirdNumber;
        }

        System.out.println("The Largest Number is :: " + largestNumber);

        scanner.close();;
    }

}
