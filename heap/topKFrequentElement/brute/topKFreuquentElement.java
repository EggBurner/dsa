package heap.topKFrequentElement.brute;

import java.util.*;

class TopKFrequent {
    public static int[] TopKFrequentF(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
