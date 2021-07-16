package com.psybergate.vacwork_202107;

import java.util.*;

public class Calculator {

  private static List<Band> bands = DataHandler.getBands();

  public static double calculate(Double taxableIncome) {
    double payableTax = 0;
    // 1. find the band
    for (int i = 0; i < bands.size(); i++) {
      if (taxableIncome <= bands.get(i).getMax() && taxableIncome >= bands.get(i).getMin()) {
        System.out.println("Band = " + (i + 1));
        // medical credit research
        // 15714 --> primary rebate
        // I think we need to ask about the credits they have first before
        // - 12000 will have to be when they have those credits not always
        payableTax = calculateTaxPayable(i, taxableIncome) - 15714.0;
        break;
      }
    }
    return  payableTax;
  }

  private static double calculateTaxPayable(int band, double taxableIncome) {
    double result = 0;
    double lastBand = 0;
    for (int i = 0; i <= band; i++) {
      if (i == band) {
        lastBand = bands.get(i).incompleteBandTax(taxableIncome);
        break;
      }
      else {
        result += bands.get(i).fullBandTax();
      }
    }

    return result + lastBand;
  }

}
