/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 9/26/23
 * File Name: Condiments.java
 * Description:
 */

package edu.bu.met.cs665.assignment1;

import java.util.Scanner;

public class Condiments implements CondimentInterface {
  String milkAmount;
  String sugarAmount;

  /**
   * This class prompts the user to choice their amount of milk.
   * First prompting if they want milk, if no the next question is skipped and
   * milk is set to 0. If yes, the next questions gives them the choice of
   * 1-3 milks. All inputs are validated.
   *
   * @return is milkAmount
   */
  public String milkChoice() {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Would you like milk?");
    String milk = myObj.nextLine();
    while (!milk.equalsIgnoreCase("Yes") && !milk.equalsIgnoreCase("No")) {
      System.out.println("Would you like milk? Please only answer 'Yes' or 'No'.");
      milk = myObj.nextLine();
    }
    if (milk.equalsIgnoreCase("yes")) {
      System.out.println("How many milks do you want? (1-3)");
      milkAmount = myObj.nextLine();
      while (!milkAmount.equals("1") && !milkAmount.equals("2")
              && !milkAmount.equals("3")) {
        System.out.println("Amount must be within range 1-3. "
                + "How many milks do you want? (1-3)");
        milkAmount = myObj.nextLine();
      }

    } else {
      milkAmount = "0";
    }

    return milkAmount;
  }

  /**
   **This class prompts the user to choice their amount of sugar.
   * First prompting if they want sugar, if no the next question is skipped and
   * sugar is set to 0. If yes, the next questions gives them the choice of
   * 1-3 sugar. All inputs are validated.
   *
   * @return is sugarAmount
   */
  public String sugarChoice() {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Would you like sugar?");
    String sugar = myObj.nextLine();
    while (!sugar.equalsIgnoreCase("Yes") && !sugar.equalsIgnoreCase("No")) {
      System.out.println("Would you like milk? Please only answer 'Yes' or 'No'.");
      sugar = myObj.nextLine();
    }

    if (sugar.equalsIgnoreCase("yes")) {
      System.out.println("How many sugars do you want? (1-3)");
      sugarAmount = myObj.nextLine();
      while (!sugarAmount.equals("1")
              && !sugarAmount.equals("2")
              && !sugarAmount.equals("3")) {
        System.out.println("Amount must be within range 1-3. "
                + "How many milks do you want? (1-3)");
        sugarAmount = myObj.nextLine();
      }
    } else {
      sugarAmount = "0";
    }

    return sugarAmount;
  }

}
