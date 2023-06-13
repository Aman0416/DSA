package data.array;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        int target, size;

        System.out.println("Please enter an array(size must be greater than 2)-");
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the size of Array:");
        size = scanner.nextInt();
        System.out.println("Now Please enter the Array:");


        int[] nums= new int[size];

        for(int i=0; i<size; i++){
            nums[i]=scanner.nextInt();
        }
        System.out.println("Now enter the target value:");
        target=scanner.nextInt();

        int[] ans = Solution(nums, target);
        System.out.println("The two element whose sum is equal to target are: "+ Arrays.toString(ans));
    }

    public static int[] Solution(int[] nums, int target) {
        int[] ans = new int[2];
        for (int a = 0; a < nums.length; a++) {
            for (int b = 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    ans = new int[]{nums[a], nums[b]};
                }
            }
        }
        return ans;
    }
}
