package heap.lastStoneWeight.brute;

import java.util.*;

class LastStoneWeight {

    public static int LastStoneWeightF(int[] stones) {

        List<Integer> list = new ArrayList<>();
        for (int x : stones) list.add(x);

        while (list.size() > 1) {

            Collections.sort(list);

            int y = list.remove(list.size() - 1);
            int x = list.remove(list.size() - 1);

            if (y > x) {
                list.add(y - x);
            }
        }

        return list.size() == 0 ? 0 : list.get(0);
    }
}