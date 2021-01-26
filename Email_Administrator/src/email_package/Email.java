package email_package;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) 
	{
		String fName;
		String lName;
		String altmail;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Name");
		fName=sc.next();
		System.out.println("Enter you Last Name");
		lName=sc.next();
		Email_data ed=new Email_data(fName,lName);
		System.out.println("Enter you alternate email");
		altmail=sc.next();
		ed.setAlternate(altmail);
		System.out.println(ed.display());
	}
}
