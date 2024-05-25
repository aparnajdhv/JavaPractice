package Assignments;
import java.util.Scanner;
public class ExceptionHandling {
	
	int id=11;
	String name="Aparna";

	public static void main(String[] args) {
				
		//Logic for Null Pointer Exception
		ExceptionHandling ex=new ExceptionHandling();
		ex=null;
		try {
			System.out.println(ex.name);
		}catch(Exception p) {
			System.out.println("Check the object pointing to NULL value");
		}		
		//Logic for ArrayIndexOutOfBoundsException
		String arr[]= {"Apple","Banana","Kiwi","Custured Apple","Orange","Pineapple","Watermelon","Chikku","Strawberry","Musk Melon"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 0 to 9 index value to fetch Data from array.");
		int index=sc.nextInt();
		try {
		System.out.println(arr[index]);
		}catch(Exception e) {
			System.out.println("Please enter valid Index value between 0-9 !");
		}
		sc.close();
	}
}