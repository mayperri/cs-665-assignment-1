/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 9/26/23
 * File Name: Drink.java
 * Description: This class prompts the user to
 * their first choice of either coffee or tea.
 */

package edu.bu.met.cs665.assignment1;

import java.util.Scanner;

public class MyDrink {
  /**
   * This class uses the scanner to accept
   * user input. It validated the user's response to
   * ony accept Coffee or Tea as valid answers.
   * After receiving a valid response is received
   * the either coffeeChoice() or teaChoice()
   * method is called.
   */
  public MyDrink() {
    String drink;

    //Create scanner
    Scanner myObj = new Scanner(System.in);

    //Ask and receive user input
    System.out.println("Would you like Coffee or Tea?");
    drink = myObj.nextLine();

    while (!drink.equalsIgnoreCase("Coffee") && !drink.equalsIgnoreCase("Tea")) {
      System.out.println("Please only answer the selected choices. "
              + "Would you like Coffee or Tea?");
      drink = myObj.nextLine();
    }

    if (drink.equalsIgnoreCase("Coffee")) {
      new Coffee().coffeeChoice();
    } else {
      new Tea().teaChoice();
    }

  }
}
