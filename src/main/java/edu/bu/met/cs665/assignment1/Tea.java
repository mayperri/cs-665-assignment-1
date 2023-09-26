/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 9/26/23
 * File Name: Tea.java
 * Description: This class is visited if the user prompted the machine to
 * make a Tea. Once that option is selected the user must
 * choose which type of Tea they would like  out of a list of three
 * options. Input validation checked. Once a valid answer is inputted
 * the user is prompted to two methods Condiments().milkChoice() and
 * Condiments().sugarChoice(). After data is used in MyMachine() class.
 */

package edu.bu.met.cs665.assignment1;

import java.util.Scanner;

public class Tea {
  String drinkChoice;

  /**
   * This method prompts and validates the user input, once validated
   * the data is set to the MyMachine class.
   */
  public String teaChoice() {
    Scanner myObj = new Scanner(System.in);
    //User input
    drinkChoice = myObj.nextLine();

    System.out.println("Which type of coffee would you like: "
            + "Black Tea, Green Tea, and Yellow Tea?");
    drinkChoice = myObj.nextLine();

    while (!drinkChoice.equalsIgnoreCase("Black Tea")
            && !drinkChoice.equalsIgnoreCase("Green Tea")
            && !drinkChoice.equalsIgnoreCase("Yellow Tea")) {
      System.out.println("Please only answer the selected choices. "
              + "Which type of coffee would you like: Black Tea, Green Tea, and Yellow Tea?");
      drinkChoice = myObj.nextLine();
    }

    String milkChoice = new Condiments().milkChoice();
    String sugarChoice = new Condiments().sugarChoice();


    MyMachine myDrink = new MyMachine(drinkChoice, milkChoice, sugarChoice);
    myDrink.setDrink(drinkChoice);
    myDrink.setDrink(milkChoice);
    myDrink.setDrink(sugarChoice);

    return "Drink Made";
  }
}
