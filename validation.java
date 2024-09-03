package jdbcformvalidation;

import java.sql.SQLException;
import java.util.Scanner;

public class validation {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		validate ob = new validate(20,30);
//		ob.display();
		Scanner d = new Scanner(System.in);
		//System.out.println("Enter 1 for login \nEnter 2 for sign1in");
		boolean flag = true;
		while(flag == true) {
			System.out.println("Enter 1 for login \nEnter 2 for signin");
			int value = d.nextInt();
		switch(value){
			case 1:
				System.out.println("You have entered the login process");
				System.out.println("Enter the username:");
				String username = d.next();
				System.out.println("Enter the password with length 8 contains a specail character:");
				String password = d.next();
				login1 ob1 = new login1(username,password);
				ob1.validate();
				break;
			case 2:
				System.out.println("You have entered the sign in process");
				System.out.println("Enter the username:");
				String username1 = d.next();
				System.out.println("Enter the password:");
				String password1 = d.next();
				validating_the_given_string obj = new validating_the_given_string();
				boolean checker1 = obj.validate1(username1);
				boolean checker = obj.validate(password1);
				if(checker == true && checker1 == true) {
				signin1 ob = new signin1(username1,password1);
				ob.store();
				}
				else {
					System.out.println("enter the correct password,username in the mentioned format");
				}
				break;
		}
		}
	}

}
