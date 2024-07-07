class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("This is [ Runnable Interface] running");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("this is [Thread Class] Running");
    }
}

class Main {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        MyThread thread2 = new MyThread();
        thread.start();
        thread2.start();

    }
}
