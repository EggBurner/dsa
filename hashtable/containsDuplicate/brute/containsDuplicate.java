package hashtable.containsDuplicate.brute;

import java.util.Arrays;

class containsDuplicate {
    public static boolean containsDuplicateF(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

      int[] i = {7,1,5,3,6,4,1};

      boolean result = containsDuplicateF(i);

        System.out.println(result);
    }
}
