package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {

  private final List<List<Integer>> result = new ArrayList<>();
  private final boolean[] visited = new boolean[6];

  public List<List<Integer>> permute(int[] nums) {
    List<Integer> answer = new ArrayList<>();
    dfs(nums, answer);
    return result;
  }

  private void dfs(int[] nums, List<Integer> answer) {
    if (nums.length == answer.size()) {
//      System.out.println(answer);
      result.add(new ArrayList<>(answer));
      return;
    }
    for (int i=0; i<nums.length; i++) {
      if (visited[i]) {
        continue;
      }
      answer.add(nums[i]);
      visited[i] = true;
      dfs(nums, answer);
      visited[i] = false;
      answer.remove(answer.size()-1);
    }
  }
}
