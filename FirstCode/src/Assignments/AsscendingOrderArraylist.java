package Assignments;
import java.util.ArrayList;
import java.util.Collections;

public class AsscendingOrderArraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<Integer>();

		num.add(20);
		num.add(90);
		num.add(15);
		num.add(54);
		num.add(76);
		
		System.out.println("ArrayList Before Sort : "+num);
		
		Collections.sort(num);
		
		System.out.println("ArrayList After Sort : "+num);
	}

}
