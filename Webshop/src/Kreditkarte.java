
public class Kreditkarte implements Onlinezahlung {

	public Kreditkarte() {
		super();
	}
	
	@Override
	public void erzeugeZahlung() {
		System.out.println("Zahlungsmethode Kreditkarte.");
	}

}