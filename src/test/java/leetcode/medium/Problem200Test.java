package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem200Test {

  @Test
  void numIslands_1() {
    Problem200 problem200 = new Problem200();

    int result = problem200.numIslands(new char[][]{
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    });

    Assertions.assertThat(result).isEqualTo(1);
  }

  @Test
  void numIslands_2() {
    Problem200 problem200 = new Problem200();

    int result = problem200.numIslands(new char[][]{
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    });

    Assertions.assertThat(result).isEqualTo(3);
  }
}
