package leetcode.medium;

public class Problem2807 {

  public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode h = head;
    while (h != null && h.next != null) {
      ListNode nextNode = h.next;
      int a = h.val;
      int b = nextNode.val;
      int gcd = gcd(Math.max(a, b), Math.min(a, b));
      // System.out.println(gcd);
      h.next = new ListNode(gcd, nextNode);
      h = nextNode;
    }
    return head;
  }

  private int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);

  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
