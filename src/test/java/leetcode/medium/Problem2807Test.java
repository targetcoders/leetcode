package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import leetcode.medium.Problem2807.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem2807Test {

  @Test
  void insertGreatestCommonDivisors_1() {
    Problem2807 problem2807 = new Problem2807();
    ListNode head = new ListNode(3, null);
    head = new ListNode(10, head);
    head = new ListNode(6, head);
    head = new ListNode(18, head);

    problem2807.insertGreatestCommonDivisors(head);
    List<Integer> result = values(head);

    Assertions.assertThat(result).containsExactly(18, 6, 6, 2, 10, 1, 3);
  }

  @Test
  void insertGreatestCommonDivisors_2() {
    Problem2807 problem2807 = new Problem2807();
    ListNode head = new ListNode(7, null);

    problem2807.insertGreatestCommonDivisors(head);
    List<Integer> result = values(head);

    Assertions.assertThat(result).containsExactly(7);
  }

  private static List<Integer> values(ListNode head) {
    ListNode h = head;
    List<Integer> result = new ArrayList<>();
    while (h != null) {
      result.add(h.val);
      h = h.next;
    }
    return result;
  }
}