package javaIntroduction;
import java.util.*;

public class SumOfNaturalNumbers {
	
     public static void main(String[] args) {
    	 int sum=0;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the number for sum of natural nos");
    	 int n = sc.nextInt();
    	 for(int i=1; i<=n;i++) {
    		 
    		 
    		 sum=sum+i;
    		 
    	 }
    	 System.out.println("Sum of "+n+" naturals nos is: "+sum);
    	 
    	 
	}
	
	

}
