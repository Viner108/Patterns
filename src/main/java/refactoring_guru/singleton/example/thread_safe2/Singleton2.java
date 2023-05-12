package refactoring_guru.singleton.example.thread_safe2;

public final class Singleton2 {
    private static volatile Singleton2 instance;
    public String value;
    private Singleton2(String value){
        this.value=value;
    }
    public static Singleton2 getInstance(String value){
        Singleton2 result=instance;
        if (result!=null){
            return result;
        }
        synchronized(Singleton2.class){
            if (instance==null){
                instance=new Singleton2(value);
            }
            return instance;
        }
    }
}
