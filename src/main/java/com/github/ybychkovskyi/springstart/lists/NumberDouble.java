package com.github.ybychkovskyi.springstart.lists;

public class NumberDouble implements Number {
  double d;

  public NumberDouble(double d) {
    this.d = d;
  }

  @Override
  public Number add(Number n) {
    return new NumberDouble((double) (d + n.toDouble()));
  }

  @Override
  public Number minus(Number n) {
    return new NumberDouble((double) (d - n.toDouble()));
  }

  @Override
  public Number multiply(Number n) {
    return new NumberDouble((double) (d * n.toDouble()));
  }

  @Override
  public Number divide(Number n) {
    return new NumberDouble((double) (d / n.toDouble()));
  }

  @Override
  public double toDouble() {
    return d;
  }
}
