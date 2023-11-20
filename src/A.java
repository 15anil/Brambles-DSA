import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        Map<Integer,String> mymap = new HashMap<>();
        mymap.put(1,"anil");
        mymap.put(2,"nemani");
        mymap.put(3,"nikhil");
        mymap.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
