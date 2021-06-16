public class Webshop {

	private String name;
	private Onlinezahlung zahlungsart;
	
	public Webshop(String name, Onlinezahlung oz) {
		this.name = name;
		this.zahlungsart = oz;
	}
	
	//damit man Zahlungsart auch noch nach Erzeugung der Webshop-Instanz ändern kann
	public void setZahlungsart(Onlinezahlung zahlungsart) {
		this.zahlungsart = zahlungsart;
	}
	
	public void zahlen() {
		zahlungsart.erzeugeZahlung();
	}
	
	public static void main(String[] args) {
		Webshop w = new Webshop("Naehshop",new PayPal());
		System.out.println("Webshop Name: " + w.name);
		w.zahlen();

	}

}
