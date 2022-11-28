public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {34, -56, 1013, -1994, 556, 289, 43, -52, 99, 158};

        int a, b, t;

        // display original array
        System.out.print("Original Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        // Bubble Sort
        for(a = 1; a < nums.length; a++) {
            for(b = nums.length - 1; b >= a; b--) {
                if(nums[b-1] > nums[b]) {
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        // display sorted array
        System.out.print("Sorted Array: ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}