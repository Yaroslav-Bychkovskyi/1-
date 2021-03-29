package com.github.ybychkovskyi.springstart;

public class GeometricProgression {


  public static void main(String[] args) {
    long x = 1;
    long y;


    for (int i = 0; i <= 30; i++) {

      y = x * 2;
      x = x * 2;


      System.out.println(y);
    }

  }

}
