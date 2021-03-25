package com.github.ybychkovskyi.springstart.lists;

public interface Number {

  Number add(Number n);
  Number minus(Number n);
  Number multiply(Number n);
  Number divide(Number n);
  double toDouble();
}
