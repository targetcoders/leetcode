package leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem3110Test {

  @Test
  void input_hello() {
    Problem3110 problem3110 = new Problem3110();

    int result = problem3110.scoreOfString("hello");

    Assertions.assertThat(result).isEqualTo(13);
  }

  @Test
  void input_zaz() {
    Problem3110 problem3110 = new Problem3110();

    int result = problem3110.scoreOfString("zaz");

    Assertions.assertThat(result).isEqualTo(50);
  }
}
