import java.util.ArrayList;
import java.util.List;

class summaryRanges {
        public static List<String> summaryRangesFunc(int[] nums) {

            List<String> ranges = new ArrayList<>();
            for(int i = 0; i< nums.length; i++){
                int start = nums[i];
                while(i+1<nums.length && nums[i+1] == nums[i]+1){
                    i++;
                }
                int end = nums[i];

                if(start == end){
                    ranges.add(String.valueOf(start));
                } else {
                    ranges.add(String.valueOf(start) +"->"+String.valueOf(end));
                }
            }

            return ranges;

    }

    public static void main(String[] args) {

            int[] nums = {0,1,2,4,5,7};

        List<String> s = summaryRangesFunc(nums);

        for(String str: s){
            System.out.print(str + " ");
        }
    }
}