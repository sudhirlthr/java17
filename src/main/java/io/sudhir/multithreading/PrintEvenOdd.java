package io.sudhir.multithreading;

public class PrintEvenOdd {
    private static int number = 1;
    private static final int LIMIT = 50;
    //private static int number = 1;
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());
        oddThread.setName("Odd-Thread");
        evenThread.setName("Even-Thread");
        evenThread.start();
        oddThread.start();

    }
    static class EvenThread implements Runnable{

        @Override
        public void run() {
            synchronized (PrintEvenOdd.class){
                while (number <= LIMIT){
                    if (number%2 == 0){
                        System.out.println(number+" with "+Thread.currentThread().getName());
                        number++;
                        //if (number >= 50) System.exit(0);
                        PrintEvenOdd.class.notifyAll();
                    } else {
                        try {
                            PrintEvenOdd.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    static class OddThread implements Runnable{

        @Override
        public void run() {
            synchronized (PrintEvenOdd.class){
                while(number <= LIMIT){
                    if (number%2 != 0){
                        System.out.println(number+" with "+Thread.currentThread().getName());
                        number++;
                        //if (number >= 50) System.exit(0);
                        PrintEvenOdd.class.notifyAll();
                    } else {
                        try {
                            PrintEvenOdd.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
