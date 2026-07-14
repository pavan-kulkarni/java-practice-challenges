package javaIntroduction;
import java.util.*;

public class InputFromUser {
	
	
	public static void main(String[] args) {
		 String name;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter your name : ");
		  name = sc.nextLine();  // reads from keyboard
		 System.out.println("Welcome : "+ name);
		 
	}

}
