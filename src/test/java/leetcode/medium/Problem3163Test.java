package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem3163Test {

  @Test
  void input_abcde() {
    Problem3163 problem3163 = new Problem3163();

    String result = problem3163.compressedString("abcde");

    Assertions.assertThat(result).isEqualTo("1a1b1c1d1e");
  }

  @Test
  void input_aaaaaaaaaaaaaabb() {
    Problem3163 problem3163 = new Problem3163();

    String result = problem3163.compressedString("aaaaaaaaaaaaaabb");

    Assertions.assertThat(result).isEqualTo("9a5a2b");
  }
}
