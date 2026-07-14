package javaIntroduction;
import java.util.*;

public class Factorial {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");

        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int fact = 1;

       
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial is " + fact);
        sc.close();
    }

}
