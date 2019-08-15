 /**
 * @(#)delosreyes.java
 *
 * delosreyes application
 *
 * @author 
 * @version 1.00 2019/8/13
 */
 import java.util.Scanner;
public class delosreyes {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);
    	String nam,cors,sec,add,con,res;
    	
    	System.out.print("Enter your name: ");
    	nam = input.nextLine();
    	System.out.print("Enter your course: ");
    	cors = input.nextLine();
    	System.out.print("Enter your section: ");
    	sec = input.nextLine();
    	System.out.print("Enter your address: ");
    	add = input.nextLine();
    	System.out.print("Enter your contact number: ");
    	con = input.nextLine();
    	
    	
    	res = nam;
    		System.out.println("Name: " + res);
    	res = cors;
    		System.out.println("Course: " + res);	
    	res = sec;
    		System.out.println("Section: " + res);
    	res = add;
    		System.out.println("Address: " + res);
    	res = con;
    		System.out.println("Contact number: " + res);		
    	
    }
}

}