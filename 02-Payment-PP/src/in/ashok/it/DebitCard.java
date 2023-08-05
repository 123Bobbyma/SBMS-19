package in.ashok.it;

public class DebitCard implements IPayment{

	@Override
	public String pay(double amt) {
		// logic
		return "payment done with Debitcard";
	}
	

}
