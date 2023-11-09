import java.util.Arrays;

public class Zeros {
    public static void seprateZeros(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            while (left < right && nums[left]!=0){
                left++;
            }
            while (left < right && nums[right] == 0){
                right--;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 0, 1, 2, 0, 8, 0};
        System.out.println("before swapping: " + Arrays.toString(arr));
        seprateZeros(arr);
        System.out.println("after swapping: " + Arrays.toString(arr));
    }
}
