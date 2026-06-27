class findClosestNumber {
    public static int findClosestNumberFunction(int[] nums) {

        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(val)) {
                val = nums[i];
            }
            else if (Math.abs(nums[i]) == Math.abs(val) && nums[i] > val) {
                val = nums[i];
            }
        }

        return val;
    }

    public static void main(String[] args) {

        int[] num = {2,-1,1};
        int n = findClosestNumberFunction(num);
        System.out.println(n);
    }
}