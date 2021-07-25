package com.psybergate.vacwork_202107;

public class TaxBracket {
  private Double min;
  private Double max;
  private Double percentage;

  public TaxBracket(Double min, Double max, Double percentage) {
    this.min = min;
    this.max = max;
    this.percentage = percentage;
  }

  public Double getMax() {
    return max;
  }

  public Double getMin() {
    return min;
  }

  public Double getPercentage() {
    return percentage;
  }

  public Double incompleteBandTax(Double taxableIncome) {
    return (taxableIncome - this.min) * this.percentage;
  }
  public Double fullBandTax() {
    return (this.max - this.min) * this.percentage;
  }

}
