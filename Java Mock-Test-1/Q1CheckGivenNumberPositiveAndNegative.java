import java.util.Scanner;

public class Q1CheckGivenNumberPositiveAndNegative{
    
    public static void checkNumber(int number){

        if(number < 0){
            System.out.println(number + " is a Negative Number");
        }else if(number == 0){
            System.out.println(number + " is Zero.");
        }else{
           System.out.println(number + " is a Positive Number"); 
        }

    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Number :: ");
        int number = scanner.nextInt();

        checkNumber(number);

        scanner.close();

    }

}