package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {

  private final List<String> answer = new ArrayList<>();
  private final String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) {
      return answer;
    }
    dfs(0, digits, new StringBuilder());
    return answer;
  }

  private void dfs(int depth, String digits, StringBuilder sb) {
    if (sb.length() == digits.length()) {
      answer.add(sb.toString());
      return;
    }

    char digit = digits.charAt(depth);
    String letter = letters[digit -'0'];
    for (int i=0; i<letter.length(); i++) {
      sb.append(letter.charAt(i));
      dfs(depth + 1, digits, sb);
      sb.setLength(depth);
    }
  }
}
