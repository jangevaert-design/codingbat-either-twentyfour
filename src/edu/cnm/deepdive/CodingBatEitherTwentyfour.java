package edu.cnm.deepdive;

/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */


public class CodingBatEitherTwentyfour {

  private static int[] one = {1, 2, 2};
  private static int[] two = {4, 4, 1};
  private static int[] three = {4, 4, 1, 2, 2};

  public static void main(String[] args) {
    System.out.println("with the array [1, 2, 2], the outcome will be " + either24(one) + ".");
    System.out.println("with the array [4, 4, 1], the outcome will be " + either24(two) + ".");
    System.out.println("with the array [4, 4, 1, 2, 2], the outcome will be " + either24(three) + ".");
  }

  public static boolean either24(int[] nums) {
    int count2 = 0;
    int count4 = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        count2++;
      }
      if (nums[i] == 4 && nums[i + 1] == 4) {
        count4++;
      }
    }
    return (count2 != count4);
  }

}
