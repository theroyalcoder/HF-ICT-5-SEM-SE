package ch.hfict.math;

public class Timer implements Runnable {
  private Thread thread;

  public void start() {
    thread = new Thread(this);
    thread.start();
  }

  public void stop() {
    thread = null;
  }

  public void run() {
    while (thread != null) {
    } catch (InterruptedException ex) {
      display();
      try {
        Thread.sleep(1000);
        System.out.println("Interrupted Exception");
      }
    }
  }
}
