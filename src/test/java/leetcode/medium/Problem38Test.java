package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem38Test {

  @Test
  public void n_1() {
    Problem38 sut = new Problem38();
    String result = sut.countAndSay(1);

    Assertions.assertThat(result).isEqualTo("1");
  }

  @Test
  public void n_4() {
    Problem38 sut = new Problem38();
    String result = sut.countAndSay(4);

    Assertions.assertThat(result).isEqualTo("1211");
  }

  @Test
  public void n_5() {
    Problem38 sut = new Problem38();
    String result = sut.countAndSay(5);

    Assertions.assertThat(result).isEqualTo("111221");
  }
}
