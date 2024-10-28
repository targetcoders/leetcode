package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {

  public List<String> generateParenthesis(int n) {
    ArrayList<String> answer = new ArrayList<>();
    dfs(n * 2, new StringBuilder(), answer);
    return answer;
  }

  private void dfs(int length, StringBuilder sb, List<String> answer) {
    if (sb.length() == length) {
      if (isValid(sb.toString())) {
        answer.add(sb.toString());
      }
      return;
    }
    sb.append('(');
    dfs(length, sb, answer);
    sb.setLength(sb.length()-1);

    sb.append(')');
    dfs(length, sb, answer);
    sb.setLength(sb.length()-1);
  }

  private boolean isValid(String result) {
    int cnt = 0;
    for (int i=0; i<result.length(); i++) {
      if (result.charAt(i) == '(') {
        cnt += 1;
      } else {
        if (cnt == 0) {
          return false;
        } else {
          cnt -= 1;
        }
      }
    }
    return cnt == 0;
  }
}
