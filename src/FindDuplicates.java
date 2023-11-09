import java.util.Arrays;

public class FindDuplicates {
    public static void findDuplicates(int nums[]){
        Arrays.sort(nums);
        int pointer1,pointer2;
        pointer1 = 0;
        pointer2 = 1;
        while (pointer2<=nums.length){
            if (nums[pointer1] == nums[pointer2]){
                System.out.println("Duplicate numbers are: " + nums[pointer1]);
                pointer1++;
                pointer2++;
            }else {
                pointer1 = pointer2;
                pointer2++;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {4,2,1,3,5,1,4,2};
        System.out.println("Array: " + Arrays.toString(array));
        findDuplicates(array);
    }
}
