package leetcode.medium;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem17Test {

  @Test
  void input_3() {
    Problem17 problem17 = new Problem17();

    List<String> answer = problem17.letterCombinations("3");

    Assertions.assertThat(answer).contains("d", "e", "f");
  }
  @Test
  void input_23() {
    Problem17 problem17 = new Problem17();

    List<String> answer = problem17.letterCombinations("23");

    Assertions.assertThat(answer).contains("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
  }

  @Test
  void input_emptyString() {
    Problem17 problem17 = new Problem17();

    List<String> answer = problem17.letterCombinations("");

    Assertions.assertThat(answer).isEmpty();
  }
}