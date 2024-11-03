package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem3Test {

  @Test
  void input_abcabcbb() {
    Problem3 problem3 = new Problem3();

    int result = problem3.lengthOfLongestSubstring("abcabcbb");

    Assertions.assertThat(result).isEqualTo(3);
  }

  @Test
  void input_bbbbb() {
    Problem3 problem3 = new Problem3();

    int result = problem3.lengthOfLongestSubstring("bbbbb");

    Assertions.assertThat(result).isEqualTo(1);
  }

  @Test
  void input_pwwkew() {
    Problem3 problem3 = new Problem3();

    int result = problem3.lengthOfLongestSubstring("pwwkew");

    Assertions.assertThat(result).isEqualTo(3);
  }

  @Test
  void input_aab() {
    Problem3 problem3 = new Problem3();

    int result = problem3.lengthOfLongestSubstring("aab");

    Assertions.assertThat(result).isEqualTo(2);
  }

  @Test
  void input_dvdf() {
    Problem3 problem3 = new Problem3();

    int result = problem3.lengthOfLongestSubstring("dvdf");

    Assertions.assertThat(result).isEqualTo(3);
  }
}
