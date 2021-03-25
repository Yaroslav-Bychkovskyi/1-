package com.github.ybychkovskyi.springstart.lists;

public class NumberFloat implements Number {
  float f;

  public NumberFloat(float f) {
    this.f = f;
  }

  @Override
  public Number add(Number n) {
    return new NumberFloat((float)(f + n.toDouble()));
  }

  @Override
  public Number minus(Number n) {
    return  new NumberFloat((float)(f - n.toDouble()));
  }

  @Override
  public Number multiply(Number n) {
    return  new NumberFloat((float)(f * n.toDouble()));
  }

  @Override
  public Number divide(Number n) {
    return  new NumberFloat((float)(f / n.toDouble()));
  }

  @Override
  public double toDouble() {
    return f;
  }
}
