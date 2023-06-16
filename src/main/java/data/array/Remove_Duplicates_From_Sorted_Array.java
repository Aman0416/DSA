package data.array;

import java.util.Scanner;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of input array first:");
        int len = scanner.nextInt();
        System.out.println("Please enter input array now:");
        int[] nums = new int[len];
        for(int i=0; i<len; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Total No. of unique elements in given array:"+k);
    }

    public static int removeDuplicates(int[] nums){
        int length = nums.length, count=0;
        for(int a=0; a<length-1; a++){
            if(nums[a]==nums[a+1]) {
                for(int b=a;b<length-1;b++){
                    nums[b]=nums[b+1];
                }
                nums[length-1]=-2147483648;
                length--;
            }
            if(nums[a]==-2147483648)
                break;
            count++;
        }
        return count;
    }
}
