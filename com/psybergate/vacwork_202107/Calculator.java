package com.psybergate.vacwork_202107;

import java.util.*;

public class Calculator {

  private static List<TaxBracket> taxBrackets = TaxTable.getTaxBrackets();

  public static double calculate(Double taxableIncome) {
    double payableTax = 0;
    // 1. find the band
    for (int i = 0; i < taxBrackets.size(); i++) {
      if (taxableIncome <= taxBrackets.get(i).getMax() && taxableIncome >= taxBrackets.get(i).getMin()) {
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
        lastBand = taxBrackets.get(i).incompleteBandTax(taxableIncome);
        break;
      }
      else {
        result += taxBrackets.get(i).fullBandTax();
      }
    }

    return result + lastBand;
  }

}
