package heap.lastStoneWeight.optimal;

import java.util.*;

class LastStoneWeight {
    public static int LastStoneWeightF(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : stones) pq.add(x);

        while (pq.size() > 1) {

            int y = pq.poll();
            int x = pq.poll();

            if (y > x) {
                pq.add(y - x);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
