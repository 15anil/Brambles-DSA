public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low;j<=high;j++){
            if (arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {3,1,2,6,9,8,5};
        System.out.println("before sorting: ");
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
        quickSort(array,0,array.length-1);
        System.out.println("after sorting is: ");
        for (int num:array){
            System.out.print(num + " ");
        }
    }
}
