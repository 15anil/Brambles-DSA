import java.util.Scanner;

public class Solution {
    public int trap(int height[]) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the height array:");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the elements of the height array:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int trappedWater = solution.trap(height);
        System.out.println("The amount of water trapped is: " + trappedWater);

        scanner.close();
    }
}
