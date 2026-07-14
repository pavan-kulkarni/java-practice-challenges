package javaIntroduction;
import java.util.*;

public class CountNumberOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int count =0;
		
		while(num >0) {
			num/=10;
			count++;
			
		}
		
		System.out.println("Number of digits in the entered number are : " + count);
	}

}
