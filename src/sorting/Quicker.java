package sorting;

public class Quicker {
    public static void quickSort1(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition1(arr, low, high);
            quickSort1(arr, low, pi - 1);
            quickSort1(arr, pi + 1, high);
        }
    }

    public static int partition1(int[] arr, int low, int high) {
        int pivot1 = arr[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot1) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {9,4,5,2,1,6};
        quickSort1(array,0,array.length-1);
        for (int num:array){
            System.out.print(num + " ");
        }
    }
}
