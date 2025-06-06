package leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem79Test {

  @Test
  public void case1() {
    char[][] board = new char[3][4];
    board[0] = new char[]{'A', 'B', 'C', 'E'};
    board[1] = new char[]{'S', 'F', 'C', 'S'};
    board[2] = new char[]{'A', 'D', 'E', 'E'};
    String word = "ABCCED";

    Problem79 sut = new Problem79();
    boolean result = sut.exist(board, word);

    Assertions.assertThat(result).isTrue();
  }

  @Test
  public void case2() {
    char[][] board = new char[3][4];
    board[0] = new char[]{'A', 'B', 'C', 'E'};
    board[1] = new char[]{'S', 'F', 'C', 'S'};
    board[2] = new char[]{'A', 'D', 'E', 'E'};
    String word = "SEE";

    Problem79 sut = new Problem79();
    boolean result = sut.exist(board, word);

    Assertions.assertThat(result).isTrue();
  }

  @Test
  public void case3() {
    char[][] board = new char[1][1];
    board[0] = new char[]{'a'};
    String word = "a";

    Problem79 sut = new Problem79();
    boolean result = sut.exist(board, word);

    Assertions.assertThat(result).isTrue();
  }
}
