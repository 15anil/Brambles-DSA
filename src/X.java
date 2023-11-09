public class X {
    public static void main(String[] args) {
        String x = "TheKiranAcademy";
        int count = 0;
        for(int i=0;i<x.length();i++){
            if (x.charAt(i)!= ' ' ) {
                count++;
            }
        }
        System.out.println("total characters are: " + count);
    }
}
