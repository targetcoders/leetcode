package leetcode.medium;

public class Problem38 {
  public String countAndSay(int n) {
    // System.out.println("n="+n);
    if (n == 1) {
      return "1";
    }
    return compress(countAndSay(n-1));
  }

  public String compress(String strNum) {
    StringBuilder sb = new StringBuilder();
    char[] arr = strNum.toCharArray();
    // System.out.println("arr="+String.valueOf(arr));
    int i=0;
    while (i < arr.length) {
      int count = 1;
      char ch = arr[i];
      // System.out.println(ch);
      while (arr.length > i+1 && arr[i] == arr[i+1]) {
        count++;
        i++;
      }
      sb.append(count).append(ch);
      // System.out.println(sb.toString());
      i++;
    }
    return sb.toString();
  }

}
