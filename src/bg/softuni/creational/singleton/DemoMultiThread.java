package bg.softuni.creational.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        Thread threadCar = new Thread(new ThreadCar());
        Thread threadManual = new Thread(new ThreadManual());

        threadCar.start();
        threadManual.start();
    }

    static class ThreadCar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BMW");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadManual implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Manual");
            System.out.println(singleton.getValue());
        }
    }
}
