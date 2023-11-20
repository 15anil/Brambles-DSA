public class Fibonacci {
    public static long fibonacci(int n){
        if(n<=1)
            return n;
        long array[] = new long[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i=2;i<=n;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i=0;i<=n;i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}
