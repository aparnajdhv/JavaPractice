package Assignments;

public class UPIPayment implements Amazon,Flipkart{

	@Override
	public void flipkartCart() {
		System.out.println("Its Flipkart");		
	}

	@Override
	public void amazonCart() {		
		System.out.println("Its Amazon");
	}

	public static void main(String[] args) {
		
		Amazon am=new UPIPayment();
		Flipkart fp=new UPIPayment();
		am.amazonCart();
		fp.flipkartCart();		
	}
}
