package leetcode.medium;

public class Problem3163 {
  public String compressedString(String word) {
    char[] s = word.toCharArray();
    StringBuilder sb = new StringBuilder();

    int idx = 0;
    while (idx < s.length) {
      char pre = s[idx];
      int cnt = 0;
      while (idx < s.length && s[idx] == pre) {
        idx += 1;
        cnt += 1;
      }
      while (cnt > 9) {
        cnt -= 9;
        sb.append(9);
        sb.append(pre);
      }
      sb.append(cnt);
      sb.append(pre);
    }

    return sb.toString();
  }
}
