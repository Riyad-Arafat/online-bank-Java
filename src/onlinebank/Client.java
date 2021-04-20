package onlinebank;

public class Client {
	protected String name;
	protected String nationalID;
	protected String phone;
	protected String address;
	protected Account account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
		// if (nationalID == "1") {

		// } else {
		// System.out.println("ID not correct");
		// }

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		String account_returned;
		if (account == null) {
			account_returned = "Account= {NULL}";
		} else {
			account_returned = account.toString();

		}
		return "Client = {\nName = " + name + "\nNational ID =" + nationalID + "\nPhone = " + phone + "\nAddress = "
				+ address + "\n" + account_returned + "\n}";
	}

	public Client() {
		name = "No Name";
		nationalID = "No ID";
		phone = "No Phone ";
		address = "No Address";
		account = null;

	}

	public Client(String n, String naID, String ph, String add, Account acc) {

		name = n;
		nationalID = naID;
		phone = ph;
		address = add;
		account = acc;

	}

}
