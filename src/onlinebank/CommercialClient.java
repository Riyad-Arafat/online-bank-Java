package onlinebank;

/**
 *
 * @author Mohamed Anter
 */

public class CommercialClient extends Client {

	private String commercialID;

	public String getCommercialID() {
		return commercialID;
	}

	public void setCommercialID(String commercialID) {
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
		return "\nCommercial ID = " + commercialID + "\nName = " + name + "\nPhone = " + phone + "\nAddress = "
				+ address + "\n" + account_returned + "\n}";

	}

	public CommercialClient() {
		super();
		commercialID = "null";
	}

	public CommercialClient(String commlID, String clientName, String clientPhone, String clienAddress,
			Account clienAccount) {
		setName(clientName);
		setPhone(clientPhone);
		setAddress(clienAddress);
		setAccount(clienAccount);
		commercialID = commlID;

	}

}
