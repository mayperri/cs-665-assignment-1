/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 9/26/23
 * File Name: Main.java
 * Description: This assignment operates as a coffee machine
 * that provides six beverage choices and a choice of up to
 * 3 milks and 3 sugars.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment1.MyDrink;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * This main method is used for development purposes as I start building my
   * coffee machine. I will act as waking up the machine.
   */
  public static void main(String[] args) {
    System.out.println("Making Drink...");
    Main me = new Main();
    me.doIt();
  }


  /**
   * This method performs the creation of a new drink.
   *
   *
   */
  private void doIt() {
    MyDrink drink = new MyDrink();
  }

}
