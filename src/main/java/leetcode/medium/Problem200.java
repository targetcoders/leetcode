package leetcode.medium;

public class Problem200 {

  public int numIslands(char[][] grid) {
    int r = grid.length;
    int c = grid[0].length;
    boolean[][] visited = new boolean[r][c];

    int answer = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (!visited[i][j] && grid[i][j] == '1') {
          //System.out.println("i=" + i + ", j=" + j);
          dfs(i, j, grid, visited);
          answer += 1;
        }
      }
    }

    return answer;
  }

  private void dfs(int r, int c, char[][] grid, boolean[][] visited) {
    if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0'
        || visited[r][c]) {
      return;
    }
    visited[r][c] = true;
    dfs(r + 1, c, grid, visited);
    dfs(r, c + 1, grid, visited);
    dfs(r - 1, c, grid, visited);
    dfs(r, c - 1, grid, visited);
  }
}
