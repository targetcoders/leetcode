package leetcode.medium;

public class Problem31 {

  public void nextPermutation(int[] nums) {
    if (nums.length == 1) {
      return;
    }

    int right = nums.length-1;
    int left = nums.length-2;
    while (0 < left) {
      if (nums[left] < nums[right]) {
        break;
      }
      left -= 1;
      right -= 1;
    }

    if (nums[left] >= nums[right]) {
      reverse(nums, 0, nums.length-1);
      return;
    }

    //피벗 포인트 값보다 크면서 가장 작은 값 구하기
    int p = left + 1;
    int min = 100;
    int minP = p;
    while (p < nums.length) {
      if (nums[left] < nums[p] && nums[p] <= min) {
        min = nums[p];
        minP = p;
      }
      p += 1;
    }

    //피벗 포인트 값과 위에서 선택된 값을 swap
    int temp = nums[left];
    nums[left] = nums[minP];
    nums[minP] = temp;

    reverse(nums, left+1, nums.length-1);
  }

  private void reverse(int[] nums, int l, int r) {
    while (l < r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l += 1;
      r -= 1;
    }
  }
}
