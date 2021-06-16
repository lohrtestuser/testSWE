
public class PayPal implements Onlinezahlung {

	public PayPal() {
		super();
	}
	//Paypal wie man's ließt
	
	@Override
	public void erzeugeZahlung() {
		System.out.println("Zahlungsmethode PayPal.");
	}

}
