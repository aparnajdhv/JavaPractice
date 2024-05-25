package javaCodeDemo1;
import java.util.*;

public class Runtime_parameters {
	
	public void DisplayUsersData(String fname,String lname,String emailAddr,String gender,long mobileNo,int  pCode) {
				
		System.out.println("Users Full name is :"+fname+" "+lname);
		System.out.println("Users Email Address is : "+emailAddr);
		System.out.println("Users Gender : "+gender);
		System.out.println("Users Mobile Number : "+mobileNo);
		System.out.println("Users Postal Code : "+pCode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :");
		String fname=sc.nextLine();
				
		System.out.println("Enter Last Name : ");
		String lname=sc.nextLine();
		
		System.out.println("Enter Email Address : ");
		String emailAddr=sc.nextLine();
		
		System.out.println("Enter your Gender (M/F) : ");
		String gender=sc.nextLine();
		
		System.out.println("Enter Mobile Number : ");
		long mobileNo=sc.nextLong();
		
		System.out.println("Enter Postal Code : ");
		int pCode=sc.nextInt();
		
		Runtime_parameters obj=new Runtime_parameters();
		obj.DisplayUsersData(fname,lname,emailAddr,gender,mobileNo,pCode);
		
		System.out.println(gender.toLowerCase());
		sc.close();
		
	}

}
