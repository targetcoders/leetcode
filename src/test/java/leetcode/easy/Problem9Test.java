package leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem9Test {

  @Test
  void x_0() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(0);

    Assertions.assertThat(result).isTrue();
  }

  @Test
  void x_5() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(5);

    Assertions.assertThat(result).isTrue();
  }

  @Test
  void x_100() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(100);

    Assertions.assertThat(result).isFalse();
  }

  @Test
  void x_1011() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(1011);

    Assertions.assertThat(result).isFalse();
  }

  @Test
  void x_10101() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(10101);

    Assertions.assertThat(result).isTrue();
  }
  @Test
  void x_110011() {
    Problem9 sut = new Problem9();

    boolean result = sut.isPalindrome(110011);

    Assertions.assertThat(result).isTrue();
  }
}
