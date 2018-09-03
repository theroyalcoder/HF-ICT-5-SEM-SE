package ch.hfict.math;

public class StatisticsTest {

  public static void main(String[] args) {
    Statistics statistics = new StatisticsImpl();
    statistics.addNumber(1.0);
    statistics.addNumber(2.0);
    statistics.addNumber(3.0);
    System.out.println("Average: " + statistics.getAverage());
  }
}
