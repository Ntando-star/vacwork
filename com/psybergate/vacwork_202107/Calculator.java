package com.psybergate.vacwork_202107;

import java.util.*;

public class Calculator {

  private static List<Band> bands = new ArrayList<>();

  private static void getBands(){
    bands.add(new Band(0.0, 216200.0,0.18)); // 150k 0
    bands.add(new Band(216201.0, 337800.0,0.26)); // 228k // 300k 1
    bands.add(new Band(337801.0, 467500.0,0.31)); // 2
    bands.add(new Band(467501.0, 613600.0,0.36));
    bands.add(new Band(613601.0, 782200.0,0.39));
    bands.add(new Band(782201.0, 1665600.0,0.41));
    bands.add(new Band(1665601.0, 1_000_000_000.0,0.45));
  }
  public static double calculate(Double taxableIncome) {
    getBands();
    double payableTax = 0;
    // 1. find the band
    for (int i = 0; i < bands.size(); i++) {
      if (taxableIncome <= bands.get(i).getMax() && taxableIncome >= bands.get(i).getMin()) {
        System.out.println("Band = " + (i + 1));
        // medical credit research
        // 15714 --> primary rebate
        payableTax = calculateTaxPayable(i, taxableIncome) - 15714.0 - 12000.0;
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
