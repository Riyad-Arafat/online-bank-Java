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
                this.bank.createClient();
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

}
