class Payment{
	double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails()
	{
		System.out.println("The amount is:"+amount);
	}
}


class  CashPayment extends Payment{
	public CashPayment()
	{
		super();
	}
}
	
class CreditCardPayment extends Payment{
	String name,expiry,cardnumber;

	public CreditCardPayment(double amount,String name, String expiry, String cardnumber) {
		super.amount=amount;
		this.name = name;
		this.expiry = expiry;
		this.cardnumber = cardnumber;
	}

	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("Name:"+name);
		System.out.println("Expiry date:"+expiry);
		System.out.println("Card Number:"+cardnumber);
	}
	
}
	

public class question7 {

	public static void main(String[] args) {
		Payment p1=new CashPayment();
		p1.setAmount(1299.12);
		p1.paymentDetails();
		
		System.out.println();
		Payment p2=new CreditCardPayment(45356,"Rachit","12/09/2023","12121214355676");
		p2.paymentDetails();

	}

}
