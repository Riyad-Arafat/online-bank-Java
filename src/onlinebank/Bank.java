package onlinebank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Riyad
 */

public class Bank {

  private String name;
  private String address;
  private String phone;
  private ArrayList<Account> accounts = new ArrayList<Account>();
  private ArrayList<Client> clients = new ArrayList<Client>();

  public Bank() {

    this.name = "null";
    this.address = "null";
    this.phone = "null";

  }

  public Bank(String name, String address, String phone) {

    this.name = name;
    this.address = address;
    this.phone = phone;

  }

  public String getName() {
    return this.name;
  }

  public String getAddres() {
    return this.address;
  }

  public String getPhone() {
    return this.phone;
  }

  public String displayClients() {
    String out = "";
    if (clients.size() > 0) {
      for (var clint : clients) {
        out += clint.toString() + "\n";
      }
    } else {
      out = "There are no CLints";
    }

    return out;
  }

  public String displayAccounts() {
    String out = "";
    if (accounts.size() > 0) {
      for (var account : accounts) {

        out += account.toString() + "\n";
      }

    } else {
      out = "There are no Accounts";
    }
    return out;
  }

  public void createClient() {
    Scanner input = new Scanner(System.in);
    String name;
    String addres;
    String nationId;
    String phone;

    System.out.println("Enter the Client Name");
    name = input.nextLine();
    System.out.println("Enter the Client Address");
    addres = input.nextLine();

    System.out.println("Enter the Client NationID");
    nationId = input.nextLine();

    System.out.println("Enter the Client Phone");
    phone = input.nextLine();

    Client client = new Client(name, nationId, phone, addres, createAccount());
    addClient(client);

  }

  public Account createAccount() {
    Scanner input = new Scanner(System.in);
    float balance;
    String accountNum;
    Account account;

    System.out.println("Enter the Account Number");
    accountNum = input.nextLine();

    System.out.println("Enter the Account balnce");
    balance = input.nextFloat();

    System.out.println("is it a Special Account !? (1 or 0)");
    if (input.nextInt() == 1) {
      account = new SpecialAccount(balance, accountNum);
    } else {
      account = new Account(balance, accountNum);

    }
    addAccount(account);
    return account;

  }

  public void setName(String bankName) {
    this.name = bankName;
  }

  public void setAddress(String bankAddress) {
    this.address = bankAddress;
  }

  public void setPhone(String bankPhobe) {
    this.phone = bankPhobe;
  }

  public void addAccount(Account account) {
    this.accounts.add(account);
  }

  public void addClient(Client client) {
    this.clients.add(client);
  }

}
