package com.github.ybychkovskyi.springstart;

public class GraphicsFeatures {

  double linear(double k, double x) {
      double y;

      y = k * x;
      System.out.println(y);
      return y;
  }

  double linearRelation(double k, double x, double b) {
    double y;

    y = k * x + b;
    System.out.println(y);
    return y;
  }

  double quadratic(double x) {
    double y;

    y = Math.pow(x, 2);
    System.out.println(y);
    return y;

  }

  double generalQuadratic(double a, double x, double b, double c) {
    double y;

    y = a * Math.pow(x, 2) + b * x + c;
    System.out.println(y);
    return y;

  }

  double power(double x) {
    double y;

    y = Math.pow(x, 3);
    System.out.println(y);
    return y;
  }

  double fractionalGegree(double x) {
    double y;

    y = Math.pow(x, 0.5);
    System.out.println(y);
    return y;
  }

  double hyperbolaPower(double k, double x) {
    double y;

    y = k / x;
    System.out.println(y);
    return y;
  }

  double showcaseExhibitor(double x) {
    double y;

    y = Math.exp(x);
    System.out.println(y);
    return y;
  }

  double exponentialFunctionGraph(double a, double x) {
    double y;

    y = Math.pow(a, x);
    System.out.println(y);
    return y;
  }

  double naturalLogarithm(double x){
    double y;

    y = Math.log(x);
    System.out.println(y);
    return y;
  }

  double logarithmic(double a, double x){
    double y;

    y = Math.log(x)/Math.log(a);
    System.out.println(y);
    return y;
  }

  double sinus(double x){
    double y;

    y = Math.sin(x);
    System.out.println(y);
    return y;
  }

  double cosine(double x){
    double y;

    y = Math.cos(x);
    System.out.println(y);
    return y;
  }

  double tangent(double x){
    double y;

    y = Math.tan(x);
    System.out.println(y);
    return y;
  }

  double cotangent(double x){
    double y;

    y = Math.cos(x)/Math.sin(x);
    System.out.println(y);
    return y;
  }

}
