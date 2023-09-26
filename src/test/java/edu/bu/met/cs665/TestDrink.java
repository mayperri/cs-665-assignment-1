package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment1.MyMachine;
import edu.bu.met.cs665.assignment1.Condiments;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrink {
  public TestDrink() {
  }

  @Test
  public void testGetDrink() {

    MyMachine drink = new MyMachine("Espresso", "1", "2");
    assertEquals("Espresso", drink.getDrink());

  }

  @Test
  public void testGetMilk() {

    MyMachine drink = new MyMachine("Americano", "3", "3");
    assertEquals("3", drink.getMilk());

  }

  @Test
  public void testAll() {

    MyMachine drink = new MyMachine("Yellow Tea", "0", "1");
    assertEquals("Yellow Tea", drink.getDrink());
    assertEquals("0", drink.getMilk());
    assertEquals("1", drink.getSugar());

  }

}
