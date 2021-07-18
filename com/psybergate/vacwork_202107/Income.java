package com.psybergate.vacwork_202107;

public class Income {

  public static final int INTEREST_EXEMPTION = 23800;

  public static double getIncome(double salary, double bonus, double interest, double gains) {

     if (interest > INTEREST_EXEMPTION) {
       interest = interest - INTEREST_EXEMPTION;
     }
     if (gains > 40001) {
       gains = (gains - 40000) * 0.4;
     } else {
       gains = 0;
     }

    double income = salary + bonus + interest + gains;
    return income;
  }

}
