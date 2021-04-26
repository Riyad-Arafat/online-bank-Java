package onlinebank;

/**
 *
 * @author Mohamed Anter
 */

public class Client {
	private static int id = 0;
	protected String name;
	protected String nationalID = "00000000000000";
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
		if (nationalID.length() != 14) {
			System.out.println("\n####Alert####\nNational ID not correct");

		} else {
			this.nationalID = nationalID;
		}

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

	public int getId() {
		return id;
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
		return "Id = " + id + "\nName = " + name + "\nNational ID = " + nationalID + "\nPhone = " + phone
				+ "\nAddress = " + address + "\n" + account_returned;
	}

	public Client() {
		name = "No Name";
		phone = "No Phone ";
		address = "No Address";
		account = null;

	}

	public Client(String clientName, String naID, String clientPhone, String clienAddress, Account clienAccount) {
		setName(clientName);
		setNationalID(naID);
		setPhone(clientPhone);
		setAddress(clienAddress);
		setAccount(clienAccount);
		id++;
	}

}
