package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testZero() {
    assertEquals(null, factorizer.exampleMethod(0));
  }

  @Test
  public void testOne() {
    assertEquals(null, factorizer.exampleMethod(1));
  }

  @Test
  public void testTen() {
    assertEquals(2 + ", " + 5, factorizer.exampleMethod(10));
  }

  @Test
  public void testNine() {
    assertEquals(3 + ", " + 3, factorizer.exampleMethod(9));
  }

  @Test
  public void testFourtyTwo() {
    assertEquals(2 + ", " + 3 + ", " + 7, factorizer.exampleMethod(42));
  }

  @Test
  public void testHundred() {
    assertEquals(2 + ", " + 2 + ", " + 5 + ", " + 5, factorizer.exampleMethod(100));
  }

  @Test
  public void testThirtyFive() {
    assertEquals(5 + ", " + 7, factorizer.exampleMethod(35));
  }

  @Test
  public void testTwentyFour() {
    assertEquals(2 + ", " + 2 + ", " + 2 + ", " + 3, factorizer.exampleMethod(24));
  }

  @Test
  public void testSeventeen() {
    assertEquals(17 + "", factorizer.exampleMethod(17));
  }

  @Test
  public void testThirteen() {
    assertEquals(13 + "", factorizer.exampleMethod(13));
  }

}
