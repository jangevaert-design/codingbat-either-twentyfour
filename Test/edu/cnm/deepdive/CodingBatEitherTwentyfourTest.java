package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatEitherTwentyfour.either24;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatEitherTwentyfourTest {

  private int[][] twentyfourParams = {
      {1, 2, 2},
      {4, 4, 1},
      {4, 4, 1, 2, 2},
      {1, 2, 3, 4},
      {3, 5, 9},
      {1, 2, 3, 4, 4},
      {2, 2, 3, 4},
      {1, 2, 3, 2, 2, 4},
      {1, 2, 3, 2, 2, 4, 4},
      {1, 2},
      {2, 2},
      {4, 4},
      {2},
      {}
  };


  private boolean[] twentyfourExpected = {true, true, false, false, false, true, true, true, false,
      false, true, true, false, false};


  @Test
  void twentyfourTest() {
    for (int i = 0; i < twentyfourParams.length; i++) {
      boolean actual = either24(twentyfourParams[i]);
      Assertions.assertEquals(actual, twentyfourExpected[i]);
    }
  }

}