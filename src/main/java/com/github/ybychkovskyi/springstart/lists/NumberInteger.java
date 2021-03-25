package com.github.ybychkovskyi.springstart.lists;

public class NumberInteger implements Number {
  int x;

  public NumberInteger(int x) {
    this.x = x;
  }

  @Override
  public Number add(Number n) {
    return new NumberInteger((int) (x + n.toDouble()));

  }

  @Override
  public Number minus(Number n) {
    return new NumberInteger((int) (x - n.toDouble()));
  }

  @Override
  public Number multiply(Number n) {
    return new NumberInteger((int) (x * n.toDouble()));
  }

  @Override
  public Number divide(Number n) {
    return new NumberInteger((int) (x / n.toDouble()));
  }

  @Override
  public double toDouble() {
    return x;
  }
}
