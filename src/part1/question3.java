package part1;

public class question3 {
    public static void main(String[] args) {
        int[] nums = {20, 52,400, 3, 30, 70, 72, 47, 28, 38, 41, 53, 20};

        int max = 99999;
        int smallPos = 0;
        int smallPos1 = 0;

        int min = 0;
        int largePos = 0;
        int largePos1 = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = Math.abs(nums[i] - nums[i + 1]);
            if (diff < max) {
                max = diff;
                smallPos = i;
                smallPos1 = i + 1;
            }
            if (diff > min) {
                min = diff;
                largePos = i;
                largePos1 = i + 1;
            }
        }

        System.out.println("smallest difference  " + nums[smallPos] + ", " + nums[smallPos1]+" at "+smallPos+", "+smallPos1);
        System.out.println("largest difference " + nums[largePos] + ", " + nums[largePos1]+" at "+largePos+", "+largePos1);
    }
}


