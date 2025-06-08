package leetcode.easy;

public class Problem9 {
  public boolean isPalindrome(int x) {
    if (x == 0) {
      return true;
    }
    if (x < 0) {
      return false;
    }

    int n = x;
    int cnt = 0;
    while (n != 0) {
      n /= 10;
      cnt += 1;
    }

    n = x;
    int[] arr = new int[cnt];
    for (int i=0; i<cnt; i++) {
      arr[cnt-1-i] = n%10;
      n /= 10;
    }

    for (int i=0; i<=cnt/2; i++) {
      if (arr[i] != arr[cnt-1-i]) {
        return false;
      }
    }
    return true;
  }
}
