import java.util.Arrays;

public class ArraysProgram {
    public static void main(String[] args) {
//        arrayFromPermutation();
        concatenationOfArray();

    }

    public static void concatenationOfArray() {
        int[] nums = {1, 2, 1};
        int n = nums.length;
        int[] ans = new int[2*n];
        int m = ans.length;

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }

//    public static void arrayFromPermutation() {
//        int[] nums = {0, 2, 1, 5, 3, 4};
//        int[] ans = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
//
//        System.out.println("The elements in the array are: ");
//        for (int j = 0; j < ans.length; j++) {
//            System.out.println(ans[j]);
//        }
//    }

}


