package leetcode.medium;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem22Test {

  @Test
  void input_1() {
    Problem22 problem22 = new Problem22();

    List<String> result = problem22.generateParenthesis(1);

    Assertions.assertThat(result).contains("()");
  }

  @Test
  void input_3() {
    Problem22 problem22 = new Problem22();

    List<String> result = problem22.generateParenthesis(3);

    Assertions.assertThat(result).contains("((()))", "(()())", "(())()", "()(())", "()()()");
  }
}