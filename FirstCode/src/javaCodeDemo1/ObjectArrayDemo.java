package javaCodeDemo1;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		
		Object arr[][] = new Object[5][2];
		
		arr[0][0]="Aparna";
		arr[0][1]="pass1";
		arr[1][0]="Snehal";
		arr[1][1]="pass2";
		arr[2][0]="Suppy";
		arr[2][1]="pass3";
		arr[3][0]="Bhagy";
		arr[3][1]="pass4";
		arr[4][0]="Amruta";
		arr[4][1]="pass5";
		
		System.out.println("Username"+" | "+"Password");
		System.out.println();
		
		for(int j=0;j<=4;j++) {
			for(int i=0;i<=1;i++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Total Number of rows are :"+arr.length);
		System.out.println("Total Number of columns are :"+arr[0].length);
	}

}
