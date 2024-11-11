package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

  public int val;
  public ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static List<Integer> values(ListNode head) {
    ListNode h = head;
    List<Integer> result = new ArrayList<>();
    while (h != null) {
      result.add(h.val);
      h = h.next;
    }
    return result;
  }
}
