package leetcode.easy;

public class Problem3110 {

  public int scoreOfString(String s) {
    char[] arr = s.toCharArray();
    int answer = 0;
    for (int i=0; i<arr.length-1; i++) {
      answer += Math.abs(arr[i] - arr[i+1]);
    }
    return answer;
  }
}
