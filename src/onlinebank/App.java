package onlinebank;

import java.util.Scanner;

/**
 *
 * @author Riyad
 */

public class App {

    private Bank bank;
    private int option;

    public static void main(String[] args) {

        App app = new App();
        app.start();
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        this.bank = new Bank();
        System.out.println("\nwelcome to our online bank");

        System.out.println("\nEnter the bank name");
        this.bank.setName(input.nextLine());

        System.out.println("\nEnter the bank address");
        this.bank.setAddress(input.nextLine());

        System.out.println("\nEnter the bank phone");
        this.bank.setPhone(input.nextLine());

        showMenu();

        while (this.option != 0) {
            if (this.option == 1) {
                this.bank.createClient();
            } else if (this.option == 2) {
                selectClient();
            } else if (this.option == 3) {
                System.out.println(this.bank.displayClients());
            } else if (this.option == 4) {
                System.out.println(this.bank.displayAccounts());
            }
            showMenu();

        }

    }

    public void showMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChose option form the menu");
            System.out.println("Create Client ( 1 )");
            System.out.println("Select Client ( 2 )");
            System.out.println("Dispaly Clients ( 3 )");
            System.out.println("Dispaly Acounts ( 4 )");
            System.out.println("Quit ( 0 )");
            try {
                this.option = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nInvalid input.");
                input.next();
            }
        }
    }

    public void selectClient() {

        Scanner input = new Scanner(System.in);
        int id;
        while (true) {
            System.out.println("\nEnter Id of the Clients:");
            try {
                id = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nInvalid input:");
                input.next();
            }
        }
        if (this.bank.getClient(id) != null) {
            subMenu();

            while (this.option != 0) {
                if (this.option == 1) {
                    System.out.println(this.bank.getClient(id).toString());
                } else if (this.option == 2) {
                    this.bank.getClient(id).getAccount().withdraw(input.nextFloat());
                } else if (this.option == 3) {
                    this.bank.getClient(id).getAccount().deposit(input.nextFloat());
                }
                subMenu();

            }

        } else {
            System.out.println("\n#### The Client is not exist ####");

        }

    }

    public void subMenu() {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChose option form the menu");
            System.out.println("Dispaly the Client ( 1 )");
            System.out.println("Do withdraw ( 2 )");
            System.out.println("Do deposit ( 3 )");
            System.out.println("reurn to main manu ( 0 )");
            try {
                this.option = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nInvalid input.");
                input.next();
            }
        }

    }

}
