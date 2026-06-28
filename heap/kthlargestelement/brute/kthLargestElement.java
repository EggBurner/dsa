package heap.kthlargestelement.brute;

import java.util.*;

class KthLargestElement {
    public static int KthLargestElementF(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
