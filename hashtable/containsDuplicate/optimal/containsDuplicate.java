package hashtable.containsDuplicate.optimal;

import java.util.HashSet;

class containsDuplicate {
    public static boolean containsDuplicateF(int[] nums) {

        HashSet<Integer> mySet = new HashSet<>();

        for (int num : nums) {
            if (mySet.contains(num)) {
                return true;
            }
            mySet.add(num);
        }
        return false;
    }



    public static void main(String[] args) {

      int[] i = {7,1,5,3,6,4,1};

      boolean result = containsDuplicateF(i);

        System.out.println(result);
    }
}
