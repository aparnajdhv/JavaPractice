package javaCodeDemo1;

public class patternDemo {

	public static void main(String[] args) {
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}//end of for loop

		System.out.println();
		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10
		
		int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((k++)+" ");
			}
			System.out.println();
		}//end of for loop
		
		System.out.println();
				
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((i)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		1
//		2
//		3
//		4
//		5 6 7 8 9 10 
		
		for(int i=1;i<=10;i++) {
			
			if(i>=5) {
				System.out.print(i+" ");
			}
			else
			{
				System.out.println(i);
			}
			
		}//end of for loop
		
	}

}
