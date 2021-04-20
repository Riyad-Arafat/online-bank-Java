package onlinebank;

public class CommercialClient extends Client {

	private int commercialID;

	public int getCommercialID() {
		return commercialID;
	}

	public void setCommercialID(int commercialID) {
		this.commercialID = commercialID;
	}

	@Override
	public String toString() {
		String account_returned;
		if (account == null) {
			account_returned = "Account= {NULL}";
		} else {
			account_returned = account.toString();

		}
		return "Client = {" + "\nCommercial ID = " + commercialID + "\nName = " + name + "\nNational ID = " + nationalID
				+ "\nPhone = " + phone + "\nAddress = " + address + "\n" + account_returned + "\n}";

	}

	public CommercialClient() {

		super();
		commercialID = 0;
	}

	public CommercialClient(int commlID, String clientName, String naID, String clientPhone, String clienAddress,
			Account clienAccount) {

		super(clientName, naID, clientPhone, clienAddress, clienAccount);
		commercialID = commlID;

	}

}
