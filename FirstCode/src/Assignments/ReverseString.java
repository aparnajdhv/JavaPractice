package Assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner rev = new Scanner(System.in);
		System.out.println("Enter String for reverse output :");
		String str=rev.nextLine();
		int lng=str.length();
		for(int i=lng-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
