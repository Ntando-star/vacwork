package com.psybergate.vacwork_202107;

public class Income {
   public static double getIncome(double salary, double bonus, double interest, double gains) {

     if (interest > 23800) {
       interest = interest - 23800;
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
