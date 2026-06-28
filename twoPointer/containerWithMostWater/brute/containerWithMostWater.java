package twoPointer.containerWithMostWater.brute;

class containerWithMostWater {
    public static int containerWithMostWaterF(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int area = Math.min(height[i], height[j]) * (j - i);

                if (area > max) {
                    max = area;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] i = {1,8,6,2,5,4,8,3,7};
        int result = containerWithMostWaterF(i);
        System.out.println(result);

    }
}
