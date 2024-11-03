package leetcode.medium;

public class Problem3 {
  public int lengthOfLongestSubstring(String s) {
    int inputLength = s.length();
    int left = 0, right = 0;
    boolean[] check = new boolean[255];
    char[] str = s.toCharArray();

    if (inputLength <= 1) {
      return inputLength;
    }

    int maxLength = 1;
    while (right < inputLength && left <= right) {
      //System.out.println("left:"+left+", right:"+right);

      if (left == right) {
        check[str[right]] = true;
        right += 1;
        continue;
      }

      if (check[str[right]]) {
        check[str[left]] = false;
        left += 1;

      } else {
        check[str[right]] = true;
        int len = right - left + 1;
        if (maxLength < len) {
          maxLength = len;
        }
        right += 1;
      }

      //System.out.println("maxLength="+maxLength);
    }

    return maxLength;
  }
}
