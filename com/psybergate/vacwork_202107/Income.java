package com.psybergate.vacwork_202107;

public class Income {
   public static double getIncome(double salary, double bonus, double interest, double gains) {

    interest = interest - 23800; // what happens for interest less than 23800 ?
    gains = (gains - 40000) * 0.4; // gains below 40000 ?

    double income = salary + bonus + interest + gains;
    return income;
  }

}
