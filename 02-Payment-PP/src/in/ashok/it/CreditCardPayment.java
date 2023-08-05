package in.ashok.it;

public class CreditCardPayment implements IPayment{

	@Override
	public String pay(double amt) {
		// logic
		return "payment done with creditcard";
	}

}
