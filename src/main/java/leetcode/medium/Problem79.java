package leetcode.medium;

public class Problem79 {

  private final StringBuilder result = new StringBuilder();
  private final int[] dr = {-1,0,1,0};
  private final int[] dc = {0,1,0,-1};

  public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
    boolean[][] visited = new boolean[m][n];
    for (int i=0; i<m; i++) {
      for (int j=0; j<n; j++) {
        if (word.charAt(0) == board[i][j]
            && dfs(board, i, j, word, visited, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, int r, int c, String word, boolean[][] visited, int len) {
    if (word.length() == len) {
      return true;
    }

    //check out of index
    if (r==-1 || r==board.length
        || c==-1 || c==board[r].length
        || visited[r][c]) {
      return false;
    }

    if (len > 0 && (word.charAt(len) != board[r][c])) {
      return false;
    }

    result.append(board[r][c]);
    visited[r][c] = true;
    // System.out.println("r="+r+",c="+c+",result="+result);
    for (int i=0; i<4; i++) {
      if (dfs(board, r + dr[i], c + dc[i], word, visited, len+1)) {
        return true;
      }
    }
    visited[r][c] = false;
    result.setLength(result.length()-1);
    return false;
  }
}
