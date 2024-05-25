package javaCodeDemo1;
import java.util.*;

public class reverseNum {
	
	public void reverse(int sum) {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number.");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}
		
		reverseNum result=new reverseNum();
		result.reverse(sum);

		sc.close();
	}

}
