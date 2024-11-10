package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem46Test {

  @Test
  void permute_1() {
    Problem46 problem46 = new Problem46();
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1,2,3));
    expected.add(Arrays.asList(1,3,2));
    expected.add(Arrays.asList(2,1,3));
    expected.add(Arrays.asList(2,3,1));
    expected.add(Arrays.asList(3,1,2));
    expected.add(Arrays.asList(3,2,1));

    List<List<Integer>> result = problem46.permute(new int[]{1, 2, 3});

    Assertions.assertThat(result).containsAll(expected);
  }

  @Test
  void permute_2() {
    Problem46 problem46 = new Problem46();
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(0,1));
    expected.add(Arrays.asList(1,0));

    List<List<Integer>> result = problem46.permute(new int[]{0,1});

    Assertions.assertThat(result).containsAll(expected);
  }

  @Test
  void permute_3() {
    Problem46 problem46 = new Problem46();
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1));

    List<List<Integer>> result = problem46.permute(new int[]{1});

    Assertions.assertThat(result).containsAll(expected);
  }
}