package com.github.ybychkovskyi.springstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphicsFeaturesTest {

  GraphicsFeatures graphicsFeatures = new GraphicsFeatures();

  @Test
  void linear() {

    double y;
    y = graphicsFeatures.linear(3, 4);

    assertEquals(12, y);

  }

  @Test
  void linearRelation() {
    double y;

    y = graphicsFeatures.linearRelation(3, 4 ,6);

    assertEquals(18, y);

  }

  @Test
  void quadratic() {
    double y;
    y = graphicsFeatures.quadratic(3);

    assertEquals(9, y);

  }

  @Test
  void generalQuadratic() {
    double y;
    y = graphicsFeatures.generalQuadratic(3, 4 , 5,6);

    System.out.println(y);
    assertEquals(74, y);
  }

  @Test
  void power() {
    double y;
    y = graphicsFeatures.power(3);

    assertEquals(27, y);
  }

  @Test
  void fractionalGegree() {
    double y;

    y = graphicsFeatures.fractionalGegree(4);

    assertEquals(2, y);;

  }

  @Test
  void hyperbolaPower() {
    double y;

    y = graphicsFeatures.hyperbolaPower(4, 2);
    assertEquals(2, y);
  }

  @Test
  void showcaseExhibitor() {
    double y;
    y = graphicsFeatures.showcaseExhibitor(2);

    assertEquals(5.4, y);
  }

  @Test
  void exponentialFunctionGraph() {
    double y;
    y = graphicsFeatures.exponentialFunctionGraph(2 , 5);

    assertEquals(32, y);
  }



  @Test
  void naturalLogarithm() {
    double y;
    y = graphicsFeatures.naturalLogarithm(2);

    assertEquals(0.69314718056, y,0.00000000001);

  }

  @Test
  void logarithmic() {
    double y;
    y = graphicsFeatures.logarithmic(2, 5);

    assertEquals(2.32, y, 0.01);
  }

  @Test
  void sinus() {
    double y;
    y = graphicsFeatures.sinus(2);

    assertEquals(0.909, y);
  }

  @Test
  void cosine() {
    double y;
    y = graphicsFeatures.cosine(2);

    assertEquals(-0.416, y);
  }

  @Test
  void tangent() {
    double y;
    y = graphicsFeatures.tangent(2);

    assertEquals(-2.18, y);
  }

  @Test
  void cotangent() {
    double y;
    y = graphicsFeatures.cotangent(2);

    assertEquals(-0.457, y);
  }
}