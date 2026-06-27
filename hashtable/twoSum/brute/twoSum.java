package hashtable.twoSum.brute;

class twoSum {
    public static int[] twoSumF(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }



    public static void main(String[] args) {

      int[] i = {2,7,11,15};

      int[] result = twoSumF(i, 9);

      for(int o: result){
          System.out.print(o +", ");
      }
    }
}
