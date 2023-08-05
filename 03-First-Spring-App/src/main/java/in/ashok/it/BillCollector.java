package in.ashok.it;

public class BillCollector {

	private IPayment payment;
	
	public BillCollector(IPayment payment) {
		this.payment= payment;
	}
	
	public void collectPayment(double amt) {
		
		String status = payment.pay(amt);
		
 		System.out.println(status);
	}
	
}
