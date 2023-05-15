package refactoring_guru.сreational.singleton.example.thread_safe2;

public class DemoMultiThread2 {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused(yay!)"+"\n"+
                "If you see different values, then 2 singletons were created(booo!!)"+ "\n\n"+
                "RESULT:" + "\n");
        Thread threadFoo= new Thread(new ThreadFoo());
        Thread threadBar=new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    static class ThreadFoo implements Runnable{
        public void run(){
            Singleton2 singleton2=Singleton2.getInstance("FOO");
            System.out.println(singleton2.value);
        }
    }
    static class ThreadBar implements Runnable{
        public void run(){
            Singleton2 singleton2=Singleton2.getInstance("BAR");
            System.out.println(singleton2.value);
        }
    }
}
