package onlinebank;

import java.util.Scanner;

public class App {

    private Bank bank;

    public static void main(String[] args) {

        App app = new App();
        app.start();
    }

    public void start() {

        Scanner input = new Scanner(System.in);
        this.bank = new Bank();
        System.out.println("welcome to our online bank");

        System.out.println("Enter the bank name");
        this.bank.setName(input.nextLine());

        System.out.println("Enter the bank address");
        this.bank.setAddress(input.nextLine());

        System.out.println("Enter the bank phone");
        this.bank.setPhone(input.nextLine());

        showMenu();
        int option = input.nextInt();

        while (option != 0) {
            if (option == 1) {
                createClient();
            } else if (option == 2) {
                System.out.println(this.bank.displayClients());
            } else if (option == 3) {
                System.out.println(this.bank.displayAccounts());
            }
            showMenu();
            option = input.nextInt();

        }
    }

    public void showMenu() {
        System.out.println("Chose option form the menu");
        System.out.println("Create Client ( 1 )");
        System.out.println("Dispaly Clients ( 2 )");
        System.out.println("Dispaly Acounts ( 3 )");
        System.out.println("Quit ( 0 )");
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
        this.bank.addClient(client);

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
        this.bank.addAccount(account);
        return account;

    }
}
