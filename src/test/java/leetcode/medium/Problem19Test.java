package leetcode.medium;


import static leetcode.ListNode.values;

import java.util.List;
import leetcode.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem19Test {

  @Test
  void removeNthFromEnd_1() {
    Problem19 problem19 = new Problem19();
    ListNode head = new ListNode(5, null);
    head = new ListNode(4, head);
    head = new ListNode(3, head);
    head = new ListNode(2, head);
    head = new ListNode(1, head);

    ListNode listNode = problem19.removeNthFromEnd(head, 2);
    List<Integer> result = values(listNode);

    Assertions.assertThat(result).containsExactly(1,2,3,5);
  }

  @Test
  void removeNthFromEnd_2() {
    Problem19 problem19 = new Problem19();
    ListNode head = new ListNode(1, null);

    ListNode listNode = problem19.removeNthFromEnd(head, 2);
    List<Integer> result = values(listNode);

    Assertions.assertThat(result).isEmpty();
  }

  @Test
  void removeNthFromEnd_3() {
    Problem19 problem19 = new Problem19();
    ListNode head = new ListNode(2, null);
    head = new ListNode(1, head);

    ListNode listNode = problem19.removeNthFromEnd(head, 1);
    List<Integer> result = values(listNode);

    Assertions.assertThat(result).containsExactly(1);
  }

  @Test
  void removeNthFromEnd_4() {
    Problem19 problem19 = new Problem19();
    ListNode head = new ListNode(2, null);
    head = new ListNode(1, head);

    ListNode listNode = problem19.removeNthFromEnd(head, 2);
    List<Integer> result = values(listNode);

    Assertions.assertThat(result).containsExactly(2);
  }
}
