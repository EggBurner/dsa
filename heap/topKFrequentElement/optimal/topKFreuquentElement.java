package heap.topKFrequentElement.optimal;

import java.util.*;

class TopKFrequent {
    public static int[] TopKFrequentF(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int key : freq.keySet()) {
            pq.add(key);
            if (pq.size() > k) pq.poll();
        }

        int[] res = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll();
        }

        return res;
    }
}
