package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem386 {
  public List<Integer> lexicalOrder(int n) {
    List<Integer> result = new ArrayList<>();
    for (int i=1; i<=9; i++) {
      dfs(n, i, result);
    }
    return result;
  }

  private void dfs(int n, int cur, List<Integer> result) {
    if (cur > n) {
      return;
    }
    result.add(cur);
    for (int j=0; j<10; j++) {
      int next = cur*10 + j;
      dfs(n, next, result);
    }
  }
}
