package Thread;

public class TestThreadApp {
    public static void main(String[] args) {
        new JThread("поток 1").start();
        new JThread("поток 2").start();
    }
}
