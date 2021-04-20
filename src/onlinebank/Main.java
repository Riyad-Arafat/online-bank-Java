package onlinebank;

import java.util.Scanner;

/**
 *
 * @author Riyad
 */

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Account a1 = new Account();
    Client c1 = new CommercialClient();
    System.out.println("#################-------------#################");
    System.out.println(c1.toString());
    System.out.println("#################-------------#################");

  }

}
