import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Q3AverageCalculator{
    
    public static void main(String[] args){
        
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int number;

        do{
            System.out.println("Enter a number (0 to stop) : ");
            number = scanner.nextInt();

            if(number != 0){
                numbers.add(number);
            }
        }while(number != 0);

        double sum = 0;

        for(int num : numbers){
            sum += num;
        }

        double average = sum / numbers.size();
        System.out.println("Average is :: " + average);

        scanner.close();
        
    }

}