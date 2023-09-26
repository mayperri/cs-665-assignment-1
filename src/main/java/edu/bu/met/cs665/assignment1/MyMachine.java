/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 9/26/23
 * File Name: MyMachine.java
 * Description: This class acts as the machine. Meaning this
 * is where the drink is created. It declares three
 * variables, drink, milk and sugar as they make up
 * the beverage.
 */

package edu.bu.met.cs665.assignment1;

public class MyMachine {
  String drink;
  String milk;
  String sugar;

  /**
   * This class has getters and setters than allow the
   * user to customize their order. It also handles the massaging
   * which notifies the customer when the order is done and
   * what has been made.
   */
  public MyMachine(String drink, String milk, String sugar) {
    this.drink = drink;
    this.milk = milk;
    this.sugar = sugar;

    System.out.println("Here is one " + this.getDrink() + " with "
            + this.getMilk() + " milk(s) and "
            + this.getSugar() + " sugar(s).");
  }

  //Gettters
  public String getDrink() {
    return drink;
  }

  public String getMilk() {
    return milk;
  }

  public String getSugar() {
    return sugar;
  }

  //Setters
  public void setDrink(String newDrink) {
    this.drink = newDrink;
  }

  public void setMilk(String newMilk) {
    this.milk = newMilk;
  }

  public void setSugar(String newSugar) {
    this.sugar = newSugar;
  }

  @Override
  public String toString() {
    return ("Here is one " + this.getDrink() + " with "
            + this.getMilk() + " milk(s) and "
            + this.getSugar() + " sugar(s).");
  }
}
