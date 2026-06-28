package heap.kthlargestelement.optimal;

import java.util.*;

class KthLargestElement {
    public static int KthLargestElementF(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : nums) {
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }

        return pq.peek();
    }
}
