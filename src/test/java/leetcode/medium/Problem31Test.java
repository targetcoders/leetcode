package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem31Test {

  @Test
  void nextPermutation_1() {
    Problem31 problem31 = new Problem31();
    int[] nums = {1, 2, 3};

    problem31.nextPermutation(nums);

    Assertions.assertThat(nums).containsExactly(1, 3, 2);
  }

  @Test
  void nextPermutation_2() {
    Problem31 problem31 = new Problem31();
    int[] nums = {3, 2, 1};

    problem31.nextPermutation(nums);

    Assertions.assertThat(nums).containsExactly(1, 2, 3);
  }

  @Test
  void nextPermutation_3() {
    Problem31 problem31 = new Problem31();
    int[] nums = {1, 1, 5};

    problem31.nextPermutation(nums);

    Assertions.assertThat(nums).containsExactly(1, 5, 1);
  }
}
