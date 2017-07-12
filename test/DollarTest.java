package test;

import org.junit.*;
import static org.junit.Assert.*;

import main.*;

public class DollarTest {
  @Test
  public void testMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(Money.dollar(5).equals(new Dollar(5)));
    assertFalse(Money.dollar(5).equals(new Dollar(6)));
    assertTrue(Money.franc(5).equals(new Franc(5)));
    assertFalse(Money.franc(5).equals(new Franc(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }
}
