package email_package;

import java.util.Scanner;

public class Email_data {
	
	private String FirstName;
	private String LastName;
	private String Password;
	private String Emailid;
	private int PasswordSize=8;
	private String Department;
	private int mailboxCapacity = 150;
	private String alternatemail;
	private String collegeName="bridgeport.edu";
	
	public Email_data( String FirstName, String LastName) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		System.out.println("NEW EMAIL ACCOUNT FOR "+ this.FirstName+" created");
		
		this.Department=setDept();
		
		this.Password=password(PasswordSize);
		System.out.println("YOUR PASSWORD IS "+this.Password);
		
		this.Emailid= FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+ Department+"."+collegeName;
	}

	private String setDept() {
		System.out.println("SELECT YOUR DEPARTMENT\n1. Computer Science\n2. Computer Engineering\n3. Electrical\n4. Medical\n5. Finance\n0. None\nSELECT:");
		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		if (option == 1) {return "cs"; }
		else if (option == 2) {return "ce";}
		else if (option == 3) {return "elec";}
		else if (option == 4) {return "med";}
		else if (option == 5) {return "fin";}
		else {return "";}
	}
	
	private String password(int size) {
		String firstpassword="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%^&*";
		char[] password=new char[size];
		for (int i=0;i<size;i++) {
			int random=(int)(Math.random()*firstpassword.length());
			password[i]=firstpassword.charAt(random);
		}
		return new String(password);
	}
	
	public void setCapacity(int max) {
		this.mailboxCapacity=max;
	}
	
	public void setAlternate(String alternate) {
		this.alternatemail=alternate;
	}
	
	public void changePass(String newPassword) {
		this.Password=newPassword;
	}
	
	public int getCapacity() {return mailboxCapacity;}
	public String getAlternate() {return alternatemail;}
	public String getPassowrd() {return Password;}
	
	public String display() {
		return "NAME:"+ FirstName +" "+LastName+
				"\nEMAIL:"+Emailid+
				"\nMAILBOX CAPACITY:"+mailboxCapacity;
	}
}