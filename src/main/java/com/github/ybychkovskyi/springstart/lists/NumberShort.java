package com.github.ybychkovskyi.springstart.lists;

public class NumberShort implements Number {
  short s;

  public NumberShort(short s) {
    this.s = s;
  }

  @Override
  public Number add(Number n) {
    return new NumberShort((short) (s + n.toDouble()));
  }

  @Override
  public Number minus(Number n) {
    return new NumberShort((short) (s - n.toDouble()));
  }

  @Override
  public Number multiply(Number n) {
    return new NumberShort((short) (s * n.toDouble()));
  }

  @Override
  public Number divide(Number n) {
    return new NumberShort((short) (s / n.toDouble()));
  }

  @Override
  public double toDouble() {
    return s;
  }
}
