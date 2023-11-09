import java.util.Scanner;

public class MergerSort {
    public static void mergeSort(int array[]){
        if(array == null || array.length<=1){
            return;
        }
        int mid = array.length/2;
        int left[] = new int[mid];
        int right[] = new  int[array.length-mid];
        for(int i=0;i<mid;i++){
            left[i] = array[i];
        }
        for(int i=mid;i< array.length;i++){
            right[i-mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    public static void merge(int left[],int right[],int arr[]){
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j< right.length){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while (i<left.length){
            arr[k++] = left[i++];
        }
        while (j< right.length){
            arr[k++] = right[j++];
        }
    }
    public static void printArray(int[] array){
        for (int value:array){
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the array elements: ");
        int array[] = new int[n];
        for (int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: ");
        printArray(array);
        mergeSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }
}
