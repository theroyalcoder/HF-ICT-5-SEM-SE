package ch.hfict.math;

import java.util.ArrayList;

public class StatisticsImpl implements Statistics {
  private ArrayList<Double> numbers = new ArrayList<Double>();

  /* (non-Javadoc)
   * @see ch.hfict.math.Statistics#addNumber(double)
   */
  @Override
  public void addNumber(double n) {
    numbers.add(n); // convert double -> Double
  }

  /* (non-Javadoc)
   * @see ch.hfict.math.Statistics#getAverage()
   */
  @Override
  public double getAverage() {
    double sum = 0;
    for (Double d: numbers) {
      sum += d;
    }
    return sum / numbers.size();
  }
}

