package leetcode.medium;


import leetcode.ListNode;

public class Problem19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode h = head;
    ListNode[] list = new ListNode[30];
    int idx = 0;
    while (h != null) {
      list[idx++] = h;
      h = h.next;
    }
    int size = idx;
    if (size == 1) {
      head = null;
      return head;
    }
    if (size - n > 0) {
      ListNode node = list[size - n - 1];
      node.next = list[size - n + 1];
    } else {
      head = head.next;
    }
    return head;
  }
}
