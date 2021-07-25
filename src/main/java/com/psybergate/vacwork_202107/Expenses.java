package com.psybergate.vacwork_202107;

import java.util.Scanner;

public class Expenses {
  public static double calculateExpense(double salary, double bonus) {
    // single responsibilities
    // Remove the questions in this function and have inputs and parameters
    Scanner scan = new Scanner(System.in);
    double travel = scan.nextDouble();
    if (travel > 80000) {
      travel = 80000;
    } else {
      travel = 0;
    }
    double fund = (salary + bonus) * 0.275;
    if (fund > 350000) {
      fund = 350000;
    } else if (funds < fund) {
      fund = funds;
    }
    double expense = fund + travel;
    return expense;
  }

}
