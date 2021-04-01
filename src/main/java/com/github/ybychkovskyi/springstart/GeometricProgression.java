package com.github.ybychkovskyi.springstart;

public class GeometricProgression {

  void geometric(long start, long multiply) {
    long x = start;
    long y;

    for (int i = 0; i <= 30; i++) {

      y = x * multiply;
      x = x * multiply;

      System.out.println(y);

    }
  }

  public static void main(String[] args) {
     GeometricProgression geometricProgression = new GeometricProgression();
     geometricProgression.geometric(1,4);

    System.out.println(geometricProgression);
  }


}
