package data.array;

import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of input array first:");
        int len = scanner.nextInt();
        System.out.println("Please enter input array now:");
        int[] nums = new int[len];
        for(int i=0; i<len; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Please enter the number to remove the array:");
        int rem = scanner.nextInt();

        int res = removeDuplicates(nums, rem);

        System.out.println("Final Output:");
        for (int a: nums) {
            System.out.printf("%d  ",a);
        }
        System.out.println("\nAnd no. of unique elements: "+res);
    }

    public static int removeDuplicates(int[] nums, int rem){
        int length = nums.length, count=0;
        for(int a=0; a<length-1; a++){
            if(nums[a]==rem){
                nums[a]=-2147483648;
            }
            else count++;
        }
        count++;
        return count;
    }
}
