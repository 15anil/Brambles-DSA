public class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){}
   public static Singleton getSingleton(){
        return singleton;
   }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
