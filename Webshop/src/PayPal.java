
public class PayPal implements Onlinezahlung {

	public PayPal() {
		super();
	}
	
	@Override
	public void erzeugeZahlung() {
		System.out.println("Zahlungsmethode PayPal.");
	}

}
