package main;

public abstract class Money {
  protected int amount;

  public abstract Money times(int multiplier);

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
      && getClass().equals(money.getClass());
  }

}
