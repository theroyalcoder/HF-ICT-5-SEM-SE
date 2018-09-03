package ch.hfict.math;

public class SimpleConsole {
  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.start();
    int c = ' ';
    while (c != 's') {
      System.out.println("Enter s to stop:");
      try {
        c = System.in.read();
      } catch (java.io.IOException e) {
      }
    }
    timer.stop();
  }
}
