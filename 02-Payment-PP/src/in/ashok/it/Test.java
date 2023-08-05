package in.ashok.it;

public class Test {

	public static void main(String[] args) {
	 BillCollector bc = new BillCollector();
	 bc.setpayment(new CreditCardPayment());
	 bc.collectPayment(1500.00);
	}

}
